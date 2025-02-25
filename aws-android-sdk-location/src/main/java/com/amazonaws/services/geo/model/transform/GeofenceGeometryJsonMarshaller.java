/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GeofenceGeometry
 */
class GeofenceGeometryJsonMarshaller {

    public void marshall(GeofenceGeometry geofenceGeometry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (geofenceGeometry.getPolygon() != null) {
            java.util.List<java.util.List<java.util.List<Double>>> polygon = geofenceGeometry
                    .getPolygon();
            jsonWriter.name("Polygon");
            jsonWriter.beginArray();
            for (java.util.List<java.util.List<Double>> polygonItem : polygon) {
                if (polygonItem != null) {
                    jsonWriter.beginArray();
                    for (java.util.List<Double> polygonItemItem : polygonItem) {
                        if (polygonItemItem != null) {
                            jsonWriter.beginArray();
                            for (Double polygonItemItemItem : polygonItemItem) {
                                if (polygonItemItemItem != null) {
                                    jsonWriter.value(polygonItemItemItem);
                                }
                            }
                            jsonWriter.endArray();
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static GeofenceGeometryJsonMarshaller instance;

    public static GeofenceGeometryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GeofenceGeometryJsonMarshaller();
        return instance;
    }
}
