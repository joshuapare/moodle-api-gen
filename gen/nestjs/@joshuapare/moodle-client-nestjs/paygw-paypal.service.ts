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
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional } from '@nestjs/common';
import { HttpService } from '@nestjs/axios';
import { AxiosResponse } from 'axios';
import { Observable } from 'rxjs';
import { ErrorResponse } from '../model/error-response';
import { PaygwPaypalCreateTransactionComplete200Response } from '../model/paygw-paypal-create-transaction-complete200-response';
import { PaygwPaypalCreateTransactionCompleteRequest } from '../model/paygw-paypal-create-transaction-complete-request';
import { PaygwPaypalGetConfigForJs200Response } from '../model/paygw-paypal-get-config-for-js200-response';
import { PaygwPaypalGetConfigForJsRequest } from '../model/paygw-paypal-get-config-for-js-request';
import { Configuration } from '../configuration';


@Injectable()
export class PaygwPaypalService {

    protected basePath = 'https://localhost/webservice/rest/server.php';
    public defaultHeaders: Record<string,string> = {};
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * Takes care of what needs to be done when a PayPal transaction comes back as complete.
     * Takes care of what needs to be done when a PayPal transaction comes back as complete.
     * @param paygwPaypalCreateTransactionCompleteRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public paygwPaypalCreateTransactionComplete(paygwPaypalCreateTransactionCompleteRequest: PaygwPaypalCreateTransactionCompleteRequest, ): Observable<AxiosResponse<PaygwPaypalCreateTransactionComplete200Response>>;
    public paygwPaypalCreateTransactionComplete(paygwPaypalCreateTransactionCompleteRequest: PaygwPaypalCreateTransactionCompleteRequest, ): Observable<any> {

        if (paygwPaypalCreateTransactionCompleteRequest === null || paygwPaypalCreateTransactionCompleteRequest === undefined) {
            throw new Error('Required parameter paygwPaypalCreateTransactionCompleteRequest was null or undefined when calling paygwPaypalCreateTransactionComplete.');
        }

        let headers = {...this.defaultHeaders};

        // authentication (apiKey) required
        if (this.configuration.apiKeys?.["Authorization"]) {
            headers['Authorization'] = this.configuration.apiKeys["Authorization"];
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<PaygwPaypalCreateTransactionComplete200Response>(`${this.basePath}/paygw_paypal_create_transaction_complete`,
            paygwPaypalCreateTransactionCompleteRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Returns the configuration settings to be used in js
     * Returns the configuration settings to be used in js
     * @param paygwPaypalGetConfigForJsRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public paygwPaypalGetConfigForJs(paygwPaypalGetConfigForJsRequest: PaygwPaypalGetConfigForJsRequest, ): Observable<AxiosResponse<PaygwPaypalGetConfigForJs200Response>>;
    public paygwPaypalGetConfigForJs(paygwPaypalGetConfigForJsRequest: PaygwPaypalGetConfigForJsRequest, ): Observable<any> {

        if (paygwPaypalGetConfigForJsRequest === null || paygwPaypalGetConfigForJsRequest === undefined) {
            throw new Error('Required parameter paygwPaypalGetConfigForJsRequest was null or undefined when calling paygwPaypalGetConfigForJs.');
        }

        let headers = {...this.defaultHeaders};

        // authentication (apiKey) required
        if (this.configuration.apiKeys?.["Authorization"]) {
            headers['Authorization'] = this.configuration.apiKeys["Authorization"];
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<PaygwPaypalGetConfigForJs200Response>(`${this.basePath}/paygw_paypal_get_config_for_js`,
            paygwPaypalGetConfigForJsRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}
