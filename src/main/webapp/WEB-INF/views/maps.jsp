<%-- 
    Document   : maps
    Created on : 27 Apr 2020, 14:33:23
    Author     : Ken
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <style>
       /* Set the size of the div element that contains the map */
      #map {
        height: 400px;  /* The height is 400 pixels */
        width: 100%;  /* The width is the width of the web page */
       }
    </style>
  </head>
  <body>
    <h3>${breweryName}</h3>
    <!--The div element for the map -->
    <div id="map"></div>
    <script>
// Initialize and add the map
function initMap() {
  // The location of Uluru
  var uluru = {lat: ${latitude}, lng: ${longitude}};
  // The map, centered at Uluru
  var map = new google.maps.Map(
      document.getElementById('map'), {zoom: 15, center: uluru});
  // The marker, positioned at Uluru
  var marker = new google.maps.Marker({position: uluru, map: map});
}
    </script>

        
                <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDL8eP4R5E_DqUEGlERhtgv27HwB2PfzNE&callback=initMap"
  type="text/javascript"></script>
              
                </body></html>