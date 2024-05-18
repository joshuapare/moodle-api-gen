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
    public interface IGradingformRubricApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </summary>
        /// <remarks>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleFetchRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GradingformRubricGraderGradingpanelFetch200Response</returns>
        GradingformRubricGraderGradingpanelFetch200Response GradingformRubricGraderGradingpanelFetch(CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest, int operationIndex = 0);

        /// <summary>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </summary>
        /// <remarks>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleFetchRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GradingformRubricGraderGradingpanelFetch200Response</returns>
        ApiResponse<GradingformRubricGraderGradingpanelFetch200Response> GradingformRubricGraderGradingpanelFetchWithHttpInfo(CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest, int operationIndex = 0);
        /// <summary>
        /// Store the grading data for a user from the grader grading panel.
        /// </summary>
        /// <remarks>
        /// Store the grading data for a user from the grader grading panel.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleStoreRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GradingformRubricGraderGradingpanelStore200Response</returns>
        GradingformRubricGraderGradingpanelStore200Response GradingformRubricGraderGradingpanelStore(CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest, int operationIndex = 0);

        /// <summary>
        /// Store the grading data for a user from the grader grading panel.
        /// </summary>
        /// <remarks>
        /// Store the grading data for a user from the grader grading panel.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleStoreRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GradingformRubricGraderGradingpanelStore200Response</returns>
        ApiResponse<GradingformRubricGraderGradingpanelStore200Response> GradingformRubricGraderGradingpanelStoreWithHttpInfo(CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGradingformRubricApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </summary>
        /// <remarks>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleFetchRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GradingformRubricGraderGradingpanelFetch200Response</returns>
        System.Threading.Tasks.Task<GradingformRubricGraderGradingpanelFetch200Response> GradingformRubricGraderGradingpanelFetchAsync(CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </summary>
        /// <remarks>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleFetchRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GradingformRubricGraderGradingpanelFetch200Response)</returns>
        System.Threading.Tasks.Task<ApiResponse<GradingformRubricGraderGradingpanelFetch200Response>> GradingformRubricGraderGradingpanelFetchWithHttpInfoAsync(CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Store the grading data for a user from the grader grading panel.
        /// </summary>
        /// <remarks>
        /// Store the grading data for a user from the grader grading panel.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleStoreRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GradingformRubricGraderGradingpanelStore200Response</returns>
        System.Threading.Tasks.Task<GradingformRubricGraderGradingpanelStore200Response> GradingformRubricGraderGradingpanelStoreAsync(CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Store the grading data for a user from the grader grading panel.
        /// </summary>
        /// <remarks>
        /// Store the grading data for a user from the grader grading panel.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleStoreRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GradingformRubricGraderGradingpanelStore200Response)</returns>
        System.Threading.Tasks.Task<ApiResponse<GradingformRubricGraderGradingpanelStore200Response>> GradingformRubricGraderGradingpanelStoreWithHttpInfoAsync(CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IGradingformRubricApi : IGradingformRubricApiSync, IGradingformRubricApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class GradingformRubricApi : IGradingformRubricApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="GradingformRubricApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GradingformRubricApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GradingformRubricApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GradingformRubricApi(string basePath)
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
        /// Initializes a new instance of the <see cref="GradingformRubricApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public GradingformRubricApi(Org.OpenAPITools.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="GradingformRubricApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public GradingformRubricApi(Org.OpenAPITools.Client.ISynchronousClient client, Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
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
        /// Fetch the data required to display the grader grading panel, creating the grade item if required Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleFetchRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GradingformRubricGraderGradingpanelFetch200Response</returns>
        public GradingformRubricGraderGradingpanelFetch200Response GradingformRubricGraderGradingpanelFetch(CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest, int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<GradingformRubricGraderGradingpanelFetch200Response> localVarResponse = GradingformRubricGraderGradingpanelFetchWithHttpInfo(coreGradesGraderGradingpanelScaleFetchRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleFetchRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GradingformRubricGraderGradingpanelFetch200Response</returns>
        public Org.OpenAPITools.Client.ApiResponse<GradingformRubricGraderGradingpanelFetch200Response> GradingformRubricGraderGradingpanelFetchWithHttpInfo(CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest, int operationIndex = 0)
        {
            // verify the required parameter 'coreGradesGraderGradingpanelScaleFetchRequest' is set
            if (coreGradesGraderGradingpanelScaleFetchRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'coreGradesGraderGradingpanelScaleFetchRequest' when calling GradingformRubricApi->GradingformRubricGraderGradingpanelFetch");
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

            localVarRequestOptions.Data = coreGradesGraderGradingpanelScaleFetchRequest;

            localVarRequestOptions.Operation = "GradingformRubricApi.GradingformRubricGraderGradingpanelFetch";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<GradingformRubricGraderGradingpanelFetch200Response>("/gradingform_rubric_grader_gradingpanel_fetch", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GradingformRubricGraderGradingpanelFetch", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleFetchRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GradingformRubricGraderGradingpanelFetch200Response</returns>
        public async System.Threading.Tasks.Task<GradingformRubricGraderGradingpanelFetch200Response> GradingformRubricGraderGradingpanelFetchAsync(CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<GradingformRubricGraderGradingpanelFetch200Response> localVarResponse = await GradingformRubricGraderGradingpanelFetchWithHttpInfoAsync(coreGradesGraderGradingpanelScaleFetchRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Fetch the data required to display the grader grading panel, creating the grade item if required Fetch the data required to display the grader grading panel, creating the grade item if required
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleFetchRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GradingformRubricGraderGradingpanelFetch200Response)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<GradingformRubricGraderGradingpanelFetch200Response>> GradingformRubricGraderGradingpanelFetchWithHttpInfoAsync(CoreGradesGraderGradingpanelScaleFetchRequest coreGradesGraderGradingpanelScaleFetchRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'coreGradesGraderGradingpanelScaleFetchRequest' is set
            if (coreGradesGraderGradingpanelScaleFetchRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'coreGradesGraderGradingpanelScaleFetchRequest' when calling GradingformRubricApi->GradingformRubricGraderGradingpanelFetch");
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

            localVarRequestOptions.Data = coreGradesGraderGradingpanelScaleFetchRequest;

            localVarRequestOptions.Operation = "GradingformRubricApi.GradingformRubricGraderGradingpanelFetch";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<GradingformRubricGraderGradingpanelFetch200Response>("/gradingform_rubric_grader_gradingpanel_fetch", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GradingformRubricGraderGradingpanelFetch", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Store the grading data for a user from the grader grading panel. Store the grading data for a user from the grader grading panel.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleStoreRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GradingformRubricGraderGradingpanelStore200Response</returns>
        public GradingformRubricGraderGradingpanelStore200Response GradingformRubricGraderGradingpanelStore(CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest, int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<GradingformRubricGraderGradingpanelStore200Response> localVarResponse = GradingformRubricGraderGradingpanelStoreWithHttpInfo(coreGradesGraderGradingpanelScaleStoreRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Store the grading data for a user from the grader grading panel. Store the grading data for a user from the grader grading panel.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleStoreRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GradingformRubricGraderGradingpanelStore200Response</returns>
        public Org.OpenAPITools.Client.ApiResponse<GradingformRubricGraderGradingpanelStore200Response> GradingformRubricGraderGradingpanelStoreWithHttpInfo(CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest, int operationIndex = 0)
        {
            // verify the required parameter 'coreGradesGraderGradingpanelScaleStoreRequest' is set
            if (coreGradesGraderGradingpanelScaleStoreRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'coreGradesGraderGradingpanelScaleStoreRequest' when calling GradingformRubricApi->GradingformRubricGraderGradingpanelStore");
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

            localVarRequestOptions.Data = coreGradesGraderGradingpanelScaleStoreRequest;

            localVarRequestOptions.Operation = "GradingformRubricApi.GradingformRubricGraderGradingpanelStore";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<GradingformRubricGraderGradingpanelStore200Response>("/gradingform_rubric_grader_gradingpanel_store", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GradingformRubricGraderGradingpanelStore", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Store the grading data for a user from the grader grading panel. Store the grading data for a user from the grader grading panel.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleStoreRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GradingformRubricGraderGradingpanelStore200Response</returns>
        public async System.Threading.Tasks.Task<GradingformRubricGraderGradingpanelStore200Response> GradingformRubricGraderGradingpanelStoreAsync(CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<GradingformRubricGraderGradingpanelStore200Response> localVarResponse = await GradingformRubricGraderGradingpanelStoreWithHttpInfoAsync(coreGradesGraderGradingpanelScaleStoreRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Store the grading data for a user from the grader grading panel. Store the grading data for a user from the grader grading panel.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="coreGradesGraderGradingpanelScaleStoreRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GradingformRubricGraderGradingpanelStore200Response)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<GradingformRubricGraderGradingpanelStore200Response>> GradingformRubricGraderGradingpanelStoreWithHttpInfoAsync(CoreGradesGraderGradingpanelScaleStoreRequest coreGradesGraderGradingpanelScaleStoreRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'coreGradesGraderGradingpanelScaleStoreRequest' is set
            if (coreGradesGraderGradingpanelScaleStoreRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'coreGradesGraderGradingpanelScaleStoreRequest' when calling GradingformRubricApi->GradingformRubricGraderGradingpanelStore");
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

            localVarRequestOptions.Data = coreGradesGraderGradingpanelScaleStoreRequest;

            localVarRequestOptions.Operation = "GradingformRubricApi.GradingformRubricGraderGradingpanelStore";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<GradingformRubricGraderGradingpanelStore200Response>("/gradingform_rubric_grader_gradingpanel_store", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GradingformRubricGraderGradingpanelStore", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
