/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGradereportOverviewApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get the given user courses final grades
        /// </summary>
        /// <remarks>
        /// Get the given user courses final grades
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewGetCourseGradesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GradereportOverviewGetCourseGrades200Response</returns>
        GradereportOverviewGetCourseGrades200Response GradereportOverviewGetCourseGrades(GradereportOverviewGetCourseGradesRequest gradereportOverviewGetCourseGradesRequest, int operationIndex = 0);

        /// <summary>
        /// Get the given user courses final grades
        /// </summary>
        /// <remarks>
        /// Get the given user courses final grades
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewGetCourseGradesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GradereportOverviewGetCourseGrades200Response</returns>
        ApiResponse<GradereportOverviewGetCourseGrades200Response> GradereportOverviewGetCourseGradesWithHttpInfo(GradereportOverviewGetCourseGradesRequest gradereportOverviewGetCourseGradesRequest, int operationIndex = 0);
        /// <summary>
        /// Trigger the report view event
        /// </summary>
        /// <remarks>
        /// Trigger the report view event
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewViewGradeReportRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>CoreCalendarDeleteSubscription200Response</returns>
        CoreCalendarDeleteSubscription200Response GradereportOverviewViewGradeReport(GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest, int operationIndex = 0);

        /// <summary>
        /// Trigger the report view event
        /// </summary>
        /// <remarks>
        /// Trigger the report view event
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewViewGradeReportRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of CoreCalendarDeleteSubscription200Response</returns>
        ApiResponse<CoreCalendarDeleteSubscription200Response> GradereportOverviewViewGradeReportWithHttpInfo(GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGradereportOverviewApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get the given user courses final grades
        /// </summary>
        /// <remarks>
        /// Get the given user courses final grades
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewGetCourseGradesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GradereportOverviewGetCourseGrades200Response</returns>
        System.Threading.Tasks.Task<GradereportOverviewGetCourseGrades200Response> GradereportOverviewGetCourseGradesAsync(GradereportOverviewGetCourseGradesRequest gradereportOverviewGetCourseGradesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get the given user courses final grades
        /// </summary>
        /// <remarks>
        /// Get the given user courses final grades
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewGetCourseGradesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GradereportOverviewGetCourseGrades200Response)</returns>
        System.Threading.Tasks.Task<ApiResponse<GradereportOverviewGetCourseGrades200Response>> GradereportOverviewGetCourseGradesWithHttpInfoAsync(GradereportOverviewGetCourseGradesRequest gradereportOverviewGetCourseGradesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Trigger the report view event
        /// </summary>
        /// <remarks>
        /// Trigger the report view event
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewViewGradeReportRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of CoreCalendarDeleteSubscription200Response</returns>
        System.Threading.Tasks.Task<CoreCalendarDeleteSubscription200Response> GradereportOverviewViewGradeReportAsync(GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Trigger the report view event
        /// </summary>
        /// <remarks>
        /// Trigger the report view event
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewViewGradeReportRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (CoreCalendarDeleteSubscription200Response)</returns>
        System.Threading.Tasks.Task<ApiResponse<CoreCalendarDeleteSubscription200Response>> GradereportOverviewViewGradeReportWithHttpInfoAsync(GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGradereportOverviewApi : IGradereportOverviewApiSync, IGradereportOverviewApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class GradereportOverviewApi : IGradereportOverviewApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportOverviewApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GradereportOverviewApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportOverviewApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GradereportOverviewApi(string basePath)
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                new Org.OpenAPITools.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportOverviewApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public GradereportOverviewApi(Org.OpenAPITools.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportOverviewApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public GradereportOverviewApi(Org.OpenAPITools.Client.ISynchronousClient client, Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Org.OpenAPITools.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Org.OpenAPITools.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Org.OpenAPITools.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Get the given user courses final grades Get the given user courses final grades
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewGetCourseGradesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GradereportOverviewGetCourseGrades200Response</returns>
        public GradereportOverviewGetCourseGrades200Response GradereportOverviewGetCourseGrades(GradereportOverviewGetCourseGradesRequest gradereportOverviewGetCourseGradesRequest, int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<GradereportOverviewGetCourseGrades200Response> localVarResponse = GradereportOverviewGetCourseGradesWithHttpInfo(gradereportOverviewGetCourseGradesRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get the given user courses final grades Get the given user courses final grades
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewGetCourseGradesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GradereportOverviewGetCourseGrades200Response</returns>
        public Org.OpenAPITools.Client.ApiResponse<GradereportOverviewGetCourseGrades200Response> GradereportOverviewGetCourseGradesWithHttpInfo(GradereportOverviewGetCourseGradesRequest gradereportOverviewGetCourseGradesRequest, int operationIndex = 0)
        {
            // verify the required parameter 'gradereportOverviewGetCourseGradesRequest' is set
            if (gradereportOverviewGetCourseGradesRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'gradereportOverviewGetCourseGradesRequest' when calling GradereportOverviewApi->GradereportOverviewGetCourseGrades");
            }

            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = gradereportOverviewGetCourseGradesRequest;

            localVarRequestOptions.Operation = "GradereportOverviewApi.GradereportOverviewGetCourseGrades";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<GradereportOverviewGetCourseGrades200Response>("/gradereport_overview_get_course_grades", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GradereportOverviewGetCourseGrades", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get the given user courses final grades Get the given user courses final grades
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewGetCourseGradesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GradereportOverviewGetCourseGrades200Response</returns>
        public async System.Threading.Tasks.Task<GradereportOverviewGetCourseGrades200Response> GradereportOverviewGetCourseGradesAsync(GradereportOverviewGetCourseGradesRequest gradereportOverviewGetCourseGradesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<GradereportOverviewGetCourseGrades200Response> localVarResponse = await GradereportOverviewGetCourseGradesWithHttpInfoAsync(gradereportOverviewGetCourseGradesRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get the given user courses final grades Get the given user courses final grades
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewGetCourseGradesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GradereportOverviewGetCourseGrades200Response)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<GradereportOverviewGetCourseGrades200Response>> GradereportOverviewGetCourseGradesWithHttpInfoAsync(GradereportOverviewGetCourseGradesRequest gradereportOverviewGetCourseGradesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'gradereportOverviewGetCourseGradesRequest' is set
            if (gradereportOverviewGetCourseGradesRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'gradereportOverviewGetCourseGradesRequest' when calling GradereportOverviewApi->GradereportOverviewGetCourseGrades");
            }


            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = gradereportOverviewGetCourseGradesRequest;

            localVarRequestOptions.Operation = "GradereportOverviewApi.GradereportOverviewGetCourseGrades";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<GradereportOverviewGetCourseGrades200Response>("/gradereport_overview_get_course_grades", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GradereportOverviewGetCourseGrades", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Trigger the report view event Trigger the report view event
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewViewGradeReportRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>CoreCalendarDeleteSubscription200Response</returns>
        public CoreCalendarDeleteSubscription200Response GradereportOverviewViewGradeReport(GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest, int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<CoreCalendarDeleteSubscription200Response> localVarResponse = GradereportOverviewViewGradeReportWithHttpInfo(gradereportOverviewViewGradeReportRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Trigger the report view event Trigger the report view event
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewViewGradeReportRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of CoreCalendarDeleteSubscription200Response</returns>
        public Org.OpenAPITools.Client.ApiResponse<CoreCalendarDeleteSubscription200Response> GradereportOverviewViewGradeReportWithHttpInfo(GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest, int operationIndex = 0)
        {
            // verify the required parameter 'gradereportOverviewViewGradeReportRequest' is set
            if (gradereportOverviewViewGradeReportRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'gradereportOverviewViewGradeReportRequest' when calling GradereportOverviewApi->GradereportOverviewViewGradeReport");
            }

            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = gradereportOverviewViewGradeReportRequest;

            localVarRequestOptions.Operation = "GradereportOverviewApi.GradereportOverviewViewGradeReport";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<CoreCalendarDeleteSubscription200Response>("/gradereport_overview_view_grade_report", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GradereportOverviewViewGradeReport", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Trigger the report view event Trigger the report view event
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewViewGradeReportRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of CoreCalendarDeleteSubscription200Response</returns>
        public async System.Threading.Tasks.Task<CoreCalendarDeleteSubscription200Response> GradereportOverviewViewGradeReportAsync(GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<CoreCalendarDeleteSubscription200Response> localVarResponse = await GradereportOverviewViewGradeReportWithHttpInfoAsync(gradereportOverviewViewGradeReportRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Trigger the report view event Trigger the report view event
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="gradereportOverviewViewGradeReportRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (CoreCalendarDeleteSubscription200Response)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<CoreCalendarDeleteSubscription200Response>> GradereportOverviewViewGradeReportWithHttpInfoAsync(GradereportOverviewViewGradeReportRequest gradereportOverviewViewGradeReportRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'gradereportOverviewViewGradeReportRequest' is set
            if (gradereportOverviewViewGradeReportRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'gradereportOverviewViewGradeReportRequest' when calling GradereportOverviewApi->GradereportOverviewViewGradeReport");
            }


            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = gradereportOverviewViewGradeReportRequest;

            localVarRequestOptions.Operation = "GradereportOverviewApi.GradereportOverviewViewGradeReport";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<CoreCalendarDeleteSubscription200Response>("/gradereport_overview_view_grade_report", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GradereportOverviewViewGradeReport", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
