var titulo = "";
function buscar (id = 0){
	$.ajax({
		/* for multiple line chart */
		url: "/datos",
		success: function(result){
			/* line chart multiple series starts here */
			var arreglo = ["SH.DYN.AIDS","SP.DYN.SMAM.MA","SP.DYN.SMAM.FE","SH.STA.DIAB.ZS","SH.MED.BEDS.ZS","SH.TBS.INCD","SP.DYN.LE00.IN"];
			var formatteddata = [];
			
			for (var key in result){
				if(key == arreglo[id]){
					titulo = result[key][0].series_name;
					//paises 10
					for(var i = 0; i < result[key].length; i++){
						var singleObject = {
							name: '',
							data: []
						}
						singleObject.name = result[key][i].country_name;
						singleObject.data.push(parseFloat(result[key][i].yr2010));
						singleObject.data.push(parseFloat(result[key][i].yr2011));
						singleObject.data.push(parseFloat(result[key][i].yr2012));
						singleObject.data.push(parseFloat(result[key][i].yr2013));
						singleObject.data.push(parseFloat(result[key][i].yr2014));
						singleObject.data.push(parseFloat(result[key][i].yr2015));
						singleObject.data.push(parseFloat(result[key][i].yr2016));
						singleObject.data.push(parseFloat(result[key][i].yr2017));
						singleObject.data.push(parseFloat(result[key][i].yr2018));
						singleObject.data.push(parseFloat(result[key][i].yr2019));
						singleObject.data.push(parseFloat(result[key][i].yr2020));
						formatteddata.push(singleObject);
					}
					break;
				}
			}	
			drawMultipleLineChart(formatteddata);
			/* line chart multiple series ends here */
		}
	});
}

/* for multiple line chart */
function drawMultipleLineChart(formatteddata){
	Highcharts.chart('container', {
	    title: {
	        text: titulo,
	    },

	    subtitle: {
	        text: 'Grupo 2 - Sistemas Distribuidos'
	    },

	    legend: {
	        layout: 'vertical',
	        align: 'right',
	        verticalAlign: 'middle'
	    },

	    plotOptions: {
	        series: {
	            label: {
	                connectorAllowed: false
	            },
	            pointStart: 2010
	        }
	    },

	    series: formatteddata,

	    responsive: {
	        rules: [{
	            condition: {
	                maxWidth: 500
	            },
	            chartOptions: {
	                legend: {
	                    layout: 'horizontal',
	                    align: 'center',
	                    verticalAlign: 'bottom'
	                }
	            }
	        }]
	    }

	});
}