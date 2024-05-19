/**
 * Moodle Webservice API
 * Auto-generated OpenAPI spec for Moodle\'s Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

export class PaygwPaypalCreateTransactionCompleteRequest {
    /**
    * The component name
    */
    'Component': string = 'null';
    /**
    * The item id in the context of the component area
    */
    'Itemid': number = null;
    /**
    * The order id coming back from PayPal
    */
    'Orderid': string = 'null';
    /**
    * Payment area in the component
    */
    'Paymentarea': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "Itemid",
            "baseName": "itemid",
            "type": "number"
        },
        {
            "name": "Orderid",
            "baseName": "orderid",
            "type": "string"
        },
        {
            "name": "Paymentarea",
            "baseName": "paymentarea",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return PaygwPaypalCreateTransactionCompleteRequest.attributeTypeMap;
    }
}

