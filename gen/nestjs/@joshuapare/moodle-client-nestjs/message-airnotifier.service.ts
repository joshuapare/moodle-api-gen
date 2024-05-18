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
import { MessageAirnotifierAreNotificationPreferencesConfigured200Response } from '../model/message-airnotifier-are-notification-preferences-configured200-response';
import { MessageAirnotifierAreNotificationPreferencesConfiguredRequest } from '../model/message-airnotifier-are-notification-preferences-configured-request';
import { MessageAirnotifierEnableDevice200Response } from '../model/message-airnotifier-enable-device200-response';
import { MessageAirnotifierEnableDeviceRequest } from '../model/message-airnotifier-enable-device-request';
import { MessageAirnotifierGetUserDevices200Response } from '../model/message-airnotifier-get-user-devices200-response';
import { MessageAirnotifierGetUserDevicesRequest } from '../model/message-airnotifier-get-user-devices-request';
import { Configuration } from '../configuration';


@Injectable()
export class MessageAirnotifierService {

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
     * Check if the users have notification preferences configured yet
     * Check if the users have notification preferences configured yet
     * @param messageAirnotifierAreNotificationPreferencesConfiguredRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public messageAirnotifierAreNotificationPreferencesConfigured(messageAirnotifierAreNotificationPreferencesConfiguredRequest: MessageAirnotifierAreNotificationPreferencesConfiguredRequest, ): Observable<AxiosResponse<MessageAirnotifierAreNotificationPreferencesConfigured200Response>>;
    public messageAirnotifierAreNotificationPreferencesConfigured(messageAirnotifierAreNotificationPreferencesConfiguredRequest: MessageAirnotifierAreNotificationPreferencesConfiguredRequest, ): Observable<any> {

        if (messageAirnotifierAreNotificationPreferencesConfiguredRequest === null || messageAirnotifierAreNotificationPreferencesConfiguredRequest === undefined) {
            throw new Error('Required parameter messageAirnotifierAreNotificationPreferencesConfiguredRequest was null or undefined when calling messageAirnotifierAreNotificationPreferencesConfigured.');
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
        return this.httpClient.post<MessageAirnotifierAreNotificationPreferencesConfigured200Response>(`${this.basePath}/message_airnotifier_are_notification_preferences_configured`,
            messageAirnotifierAreNotificationPreferencesConfiguredRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Enables or disables a registered user device so it can receive Push notifications
     * Enables or disables a registered user device so it can receive Push notifications
     * @param messageAirnotifierEnableDeviceRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public messageAirnotifierEnableDevice(messageAirnotifierEnableDeviceRequest: MessageAirnotifierEnableDeviceRequest, ): Observable<AxiosResponse<MessageAirnotifierEnableDevice200Response>>;
    public messageAirnotifierEnableDevice(messageAirnotifierEnableDeviceRequest: MessageAirnotifierEnableDeviceRequest, ): Observable<any> {

        if (messageAirnotifierEnableDeviceRequest === null || messageAirnotifierEnableDeviceRequest === undefined) {
            throw new Error('Required parameter messageAirnotifierEnableDeviceRequest was null or undefined when calling messageAirnotifierEnableDevice.');
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
        return this.httpClient.post<MessageAirnotifierEnableDevice200Response>(`${this.basePath}/message_airnotifier_enable_device`,
            messageAirnotifierEnableDeviceRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Return the list of mobile devices that are registered in Moodle for the given user
     * Return the list of mobile devices that are registered in Moodle for the given user
     * @param messageAirnotifierGetUserDevicesRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public messageAirnotifierGetUserDevices(messageAirnotifierGetUserDevicesRequest: MessageAirnotifierGetUserDevicesRequest, ): Observable<AxiosResponse<MessageAirnotifierGetUserDevices200Response>>;
    public messageAirnotifierGetUserDevices(messageAirnotifierGetUserDevicesRequest: MessageAirnotifierGetUserDevicesRequest, ): Observable<any> {

        if (messageAirnotifierGetUserDevicesRequest === null || messageAirnotifierGetUserDevicesRequest === undefined) {
            throw new Error('Required parameter messageAirnotifierGetUserDevicesRequest was null or undefined when calling messageAirnotifierGetUserDevices.');
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
        return this.httpClient.post<MessageAirnotifierGetUserDevices200Response>(`${this.basePath}/message_airnotifier_get_user_devices`,
            messageAirnotifierGetUserDevicesRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Check whether the airnotifier settings have been configured
     * Check whether the airnotifier settings have been configured
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public messageAirnotifierIsSystemConfigured(): Observable<AxiosResponse<object>>;
    public messageAirnotifierIsSystemConfigured(): Observable<any> {

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
        ];
        return this.httpClient.post<object>(`${this.basePath}/message_airnotifier_is_system_configured`,
            null,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}
