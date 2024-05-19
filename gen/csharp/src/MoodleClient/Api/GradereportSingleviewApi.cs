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
using MoodleClient.Client;
using MoodleClient.Model;

namespace MoodleClient.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGradereportSingleviewApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get the gradeitem/(s) for a course
        /// </summary>
        /// <remarks>
        /// Get the gradeitem/(s) for a course
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGetGroupsForSearchWidgetRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GradereportSingleviewGetGradeItemsForSearchWidget200Response</returns>
        GradereportSingleviewGetGradeItemsForSearchWidget200Response GradereportSingleviewGetGradeItemsForSearchWidget(CoreGradesGetGroupsForSearchWidgetRequest coreGradesGetGroupsForSearchWidgetRequest, int operationIndex = 0);

        /// <summary>
        /// Get the gradeitem/(s) for a course
        /// </summary>
        /// <remarks>
        /// Get the gradeitem/(s) for a course
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGetGroupsForSearchWidgetRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GradereportSingleviewGetGradeItemsForSearchWidget200Response</returns>
        ApiResponse<GradereportSingleviewGetGradeItemsForSearchWidget200Response> GradereportSingleviewGetGradeItemsForSearchWidgetWithHttpInfo(CoreGradesGetGroupsForSearchWidgetRequest coreGradesGetGroupsForSearchWidgetRequest, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGradereportSingleviewApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get the gradeitem/(s) for a course
        /// </summary>
        /// <remarks>
        /// Get the gradeitem/(s) for a course
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGetGroupsForSearchWidgetRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GradereportSingleviewGetGradeItemsForSearchWidget200Response</returns>
        System.Threading.Tasks.Task<GradereportSingleviewGetGradeItemsForSearchWidget200Response> GradereportSingleviewGetGradeItemsForSearchWidgetAsync(CoreGradesGetGroupsForSearchWidgetRequest coreGradesGetGroupsForSearchWidgetRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get the gradeitem/(s) for a course
        /// </summary>
        /// <remarks>
        /// Get the gradeitem/(s) for a course
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGetGroupsForSearchWidgetRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GradereportSingleviewGetGradeItemsForSearchWidget200Response)</returns>
        System.Threading.Tasks.Task<ApiResponse<GradereportSingleviewGetGradeItemsForSearchWidget200Response>> GradereportSingleviewGetGradeItemsForSearchWidgetWithHttpInfoAsync(CoreGradesGetGroupsForSearchWidgetRequest coreGradesGetGroupsForSearchWidgetRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGradereportSingleviewApi : IGradereportSingleviewApiSync, IGradereportSingleviewApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class GradereportSingleviewApi : IGradereportSingleviewApi
    {
        private MoodleClient.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportSingleviewApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GradereportSingleviewApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportSingleviewApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GradereportSingleviewApi(string basePath)
        {
            this.Configuration = MoodleClient.Client.Configuration.MergeConfigurations(
                MoodleClient.Client.GlobalConfiguration.Instance,
                new MoodleClient.Client.Configuration { BasePath = basePath }
            );
            this.Client = new MoodleClient.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new MoodleClient.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = MoodleClient.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportSingleviewApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public GradereportSingleviewApi(MoodleClient.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = MoodleClient.Client.Configuration.MergeConfigurations(
                MoodleClient.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new MoodleClient.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new MoodleClient.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = MoodleClient.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GradereportSingleviewApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public GradereportSingleviewApi(MoodleClient.Client.ISynchronousClient client, MoodleClient.Client.IAsynchronousClient asyncClient, MoodleClient.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = MoodleClient.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public MoodleClient.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public MoodleClient.Client.ISynchronousClient Client { get; set; }

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
        public MoodleClient.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public MoodleClient.Client.ExceptionFactory ExceptionFactory
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
        /// Get the gradeitem/(s) for a course Get the gradeitem/(s) for a course
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGetGroupsForSearchWidgetRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GradereportSingleviewGetGradeItemsForSearchWidget200Response</returns>
        public GradereportSingleviewGetGradeItemsForSearchWidget200Response GradereportSingleviewGetGradeItemsForSearchWidget(CoreGradesGetGroupsForSearchWidgetRequest coreGradesGetGroupsForSearchWidgetRequest, int operationIndex = 0)
        {
            MoodleClient.Client.ApiResponse<GradereportSingleviewGetGradeItemsForSearchWidget200Response> localVarResponse = GradereportSingleviewGetGradeItemsForSearchWidgetWithHttpInfo(coreGradesGetGroupsForSearchWidgetRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get the gradeitem/(s) for a course Get the gradeitem/(s) for a course
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGetGroupsForSearchWidgetRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GradereportSingleviewGetGradeItemsForSearchWidget200Response</returns>
        public MoodleClient.Client.ApiResponse<GradereportSingleviewGetGradeItemsForSearchWidget200Response> GradereportSingleviewGetGradeItemsForSearchWidgetWithHttpInfo(CoreGradesGetGroupsForSearchWidgetRequest coreGradesGetGroupsForSearchWidgetRequest, int operationIndex = 0)
        {
            // verify the required parameter 'coreGradesGetGroupsForSearchWidgetRequest' is set
            if (coreGradesGetGroupsForSearchWidgetRequest == null)
            {
                throw new MoodleClient.Client.ApiException(400, "Missing required parameter 'coreGradesGetGroupsForSearchWidgetRequest' when calling GradereportSingleviewApi->GradereportSingleviewGetGradeItemsForSearchWidget");
            }

            MoodleClient.Client.RequestOptions localVarRequestOptions = new MoodleClient.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = MoodleClient.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = MoodleClient.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = coreGradesGetGroupsForSearchWidgetRequest;

            localVarRequestOptions.Operation = "GradereportSingleviewApi.GradereportSingleviewGetGradeItemsForSearchWidget";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<GradereportSingleviewGetGradeItemsForSearchWidget200Response>("/gradereport_singleview_get_grade_items_for_search_widget", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GradereportSingleviewGetGradeItemsForSearchWidget", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get the gradeitem/(s) for a course Get the gradeitem/(s) for a course
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGetGroupsForSearchWidgetRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GradereportSingleviewGetGradeItemsForSearchWidget200Response</returns>
        public async System.Threading.Tasks.Task<GradereportSingleviewGetGradeItemsForSearchWidget200Response> GradereportSingleviewGetGradeItemsForSearchWidgetAsync(CoreGradesGetGroupsForSearchWidgetRequest coreGradesGetGroupsForSearchWidgetRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            MoodleClient.Client.ApiResponse<GradereportSingleviewGetGradeItemsForSearchWidget200Response> localVarResponse = await GradereportSingleviewGetGradeItemsForSearchWidgetWithHttpInfoAsync(coreGradesGetGroupsForSearchWidgetRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get the gradeitem/(s) for a course Get the gradeitem/(s) for a course
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGetGroupsForSearchWidgetRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GradereportSingleviewGetGradeItemsForSearchWidget200Response)</returns>
        public async System.Threading.Tasks.Task<MoodleClient.Client.ApiResponse<GradereportSingleviewGetGradeItemsForSearchWidget200Response>> GradereportSingleviewGetGradeItemsForSearchWidgetWithHttpInfoAsync(CoreGradesGetGroupsForSearchWidgetRequest coreGradesGetGroupsForSearchWidgetRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'coreGradesGetGroupsForSearchWidgetRequest' is set
            if (coreGradesGetGroupsForSearchWidgetRequest == null)
            {
                throw new MoodleClient.Client.ApiException(400, "Missing required parameter 'coreGradesGetGroupsForSearchWidgetRequest' when calling GradereportSingleviewApi->GradereportSingleviewGetGradeItemsForSearchWidget");
            }


            MoodleClient.Client.RequestOptions localVarRequestOptions = new MoodleClient.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = MoodleClient.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = MoodleClient.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = coreGradesGetGroupsForSearchWidgetRequest;

            localVarRequestOptions.Operation = "GradereportSingleviewApi.GradereportSingleviewGetGradeItemsForSearchWidget";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<GradereportSingleviewGetGradeItemsForSearchWidget200Response>("/gradereport_singleview_get_grade_items_for_search_widget", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GradereportSingleviewGetGradeItemsForSearchWidget", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}