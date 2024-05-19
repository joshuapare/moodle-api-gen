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
    public interface IToolMoodlenetApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// For some given input search for a course that matches
        /// </summary>
        /// <remarks>
        /// For some given input search for a course that matches
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetSearchCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ToolMoodlenetSearchCourses200Response</returns>
        ToolMoodlenetSearchCourses200Response ToolMoodlenetSearchCourses(ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest, int operationIndex = 0);

        /// <summary>
        /// For some given input search for a course that matches
        /// </summary>
        /// <remarks>
        /// For some given input search for a course that matches
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetSearchCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of ToolMoodlenetSearchCourses200Response</returns>
        ApiResponse<ToolMoodlenetSearchCourses200Response> ToolMoodlenetSearchCoursesWithHttpInfo(ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest, int operationIndex = 0);
        /// <summary>
        /// Verify if the passed information resolves into a WebFinger profile URL
        /// </summary>
        /// <remarks>
        /// Verify if the passed information resolves into a WebFinger profile URL
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetVerifyWebfingerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ToolMoodlenetVerifyWebfinger200Response</returns>
        ToolMoodlenetVerifyWebfinger200Response ToolMoodlenetVerifyWebfinger(ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest, int operationIndex = 0);

        /// <summary>
        /// Verify if the passed information resolves into a WebFinger profile URL
        /// </summary>
        /// <remarks>
        /// Verify if the passed information resolves into a WebFinger profile URL
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetVerifyWebfingerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of ToolMoodlenetVerifyWebfinger200Response</returns>
        ApiResponse<ToolMoodlenetVerifyWebfinger200Response> ToolMoodlenetVerifyWebfingerWithHttpInfo(ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IToolMoodlenetApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// For some given input search for a course that matches
        /// </summary>
        /// <remarks>
        /// For some given input search for a course that matches
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetSearchCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ToolMoodlenetSearchCourses200Response</returns>
        System.Threading.Tasks.Task<ToolMoodlenetSearchCourses200Response> ToolMoodlenetSearchCoursesAsync(ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// For some given input search for a course that matches
        /// </summary>
        /// <remarks>
        /// For some given input search for a course that matches
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetSearchCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ToolMoodlenetSearchCourses200Response)</returns>
        System.Threading.Tasks.Task<ApiResponse<ToolMoodlenetSearchCourses200Response>> ToolMoodlenetSearchCoursesWithHttpInfoAsync(ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Verify if the passed information resolves into a WebFinger profile URL
        /// </summary>
        /// <remarks>
        /// Verify if the passed information resolves into a WebFinger profile URL
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetVerifyWebfingerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ToolMoodlenetVerifyWebfinger200Response</returns>
        System.Threading.Tasks.Task<ToolMoodlenetVerifyWebfinger200Response> ToolMoodlenetVerifyWebfingerAsync(ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Verify if the passed information resolves into a WebFinger profile URL
        /// </summary>
        /// <remarks>
        /// Verify if the passed information resolves into a WebFinger profile URL
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetVerifyWebfingerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ToolMoodlenetVerifyWebfinger200Response)</returns>
        System.Threading.Tasks.Task<ApiResponse<ToolMoodlenetVerifyWebfinger200Response>> ToolMoodlenetVerifyWebfingerWithHttpInfoAsync(ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IToolMoodlenetApi : IToolMoodlenetApiSync, IToolMoodlenetApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ToolMoodlenetApi : IToolMoodlenetApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ToolMoodlenetApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ToolMoodlenetApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ToolMoodlenetApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ToolMoodlenetApi(string basePath)
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
        /// Initializes a new instance of the <see cref="ToolMoodlenetApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ToolMoodlenetApi(Org.OpenAPITools.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="ToolMoodlenetApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ToolMoodlenetApi(Org.OpenAPITools.Client.ISynchronousClient client, Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
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
        /// For some given input search for a course that matches For some given input search for a course that matches
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetSearchCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ToolMoodlenetSearchCourses200Response</returns>
        public ToolMoodlenetSearchCourses200Response ToolMoodlenetSearchCourses(ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest, int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<ToolMoodlenetSearchCourses200Response> localVarResponse = ToolMoodlenetSearchCoursesWithHttpInfo(toolMoodlenetSearchCoursesRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// For some given input search for a course that matches For some given input search for a course that matches
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetSearchCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of ToolMoodlenetSearchCourses200Response</returns>
        public Org.OpenAPITools.Client.ApiResponse<ToolMoodlenetSearchCourses200Response> ToolMoodlenetSearchCoursesWithHttpInfo(ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest, int operationIndex = 0)
        {
            // verify the required parameter 'toolMoodlenetSearchCoursesRequest' is set
            if (toolMoodlenetSearchCoursesRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'toolMoodlenetSearchCoursesRequest' when calling ToolMoodlenetApi->ToolMoodlenetSearchCourses");
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

            localVarRequestOptions.Data = toolMoodlenetSearchCoursesRequest;

            localVarRequestOptions.Operation = "ToolMoodlenetApi.ToolMoodlenetSearchCourses";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<ToolMoodlenetSearchCourses200Response>("/tool_moodlenet_search_courses", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ToolMoodlenetSearchCourses", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// For some given input search for a course that matches For some given input search for a course that matches
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetSearchCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ToolMoodlenetSearchCourses200Response</returns>
        public async System.Threading.Tasks.Task<ToolMoodlenetSearchCourses200Response> ToolMoodlenetSearchCoursesAsync(ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<ToolMoodlenetSearchCourses200Response> localVarResponse = await ToolMoodlenetSearchCoursesWithHttpInfoAsync(toolMoodlenetSearchCoursesRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// For some given input search for a course that matches For some given input search for a course that matches
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetSearchCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ToolMoodlenetSearchCourses200Response)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<ToolMoodlenetSearchCourses200Response>> ToolMoodlenetSearchCoursesWithHttpInfoAsync(ToolMoodlenetSearchCoursesRequest toolMoodlenetSearchCoursesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'toolMoodlenetSearchCoursesRequest' is set
            if (toolMoodlenetSearchCoursesRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'toolMoodlenetSearchCoursesRequest' when calling ToolMoodlenetApi->ToolMoodlenetSearchCourses");
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

            localVarRequestOptions.Data = toolMoodlenetSearchCoursesRequest;

            localVarRequestOptions.Operation = "ToolMoodlenetApi.ToolMoodlenetSearchCourses";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<ToolMoodlenetSearchCourses200Response>("/tool_moodlenet_search_courses", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ToolMoodlenetSearchCourses", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Verify if the passed information resolves into a WebFinger profile URL Verify if the passed information resolves into a WebFinger profile URL
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetVerifyWebfingerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ToolMoodlenetVerifyWebfinger200Response</returns>
        public ToolMoodlenetVerifyWebfinger200Response ToolMoodlenetVerifyWebfinger(ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest, int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<ToolMoodlenetVerifyWebfinger200Response> localVarResponse = ToolMoodlenetVerifyWebfingerWithHttpInfo(toolMoodlenetVerifyWebfingerRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Verify if the passed information resolves into a WebFinger profile URL Verify if the passed information resolves into a WebFinger profile URL
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetVerifyWebfingerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of ToolMoodlenetVerifyWebfinger200Response</returns>
        public Org.OpenAPITools.Client.ApiResponse<ToolMoodlenetVerifyWebfinger200Response> ToolMoodlenetVerifyWebfingerWithHttpInfo(ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest, int operationIndex = 0)
        {
            // verify the required parameter 'toolMoodlenetVerifyWebfingerRequest' is set
            if (toolMoodlenetVerifyWebfingerRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'toolMoodlenetVerifyWebfingerRequest' when calling ToolMoodlenetApi->ToolMoodlenetVerifyWebfinger");
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

            localVarRequestOptions.Data = toolMoodlenetVerifyWebfingerRequest;

            localVarRequestOptions.Operation = "ToolMoodlenetApi.ToolMoodlenetVerifyWebfinger";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<ToolMoodlenetVerifyWebfinger200Response>("/tool_moodlenet_verify_webfinger", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ToolMoodlenetVerifyWebfinger", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Verify if the passed information resolves into a WebFinger profile URL Verify if the passed information resolves into a WebFinger profile URL
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetVerifyWebfingerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ToolMoodlenetVerifyWebfinger200Response</returns>
        public async System.Threading.Tasks.Task<ToolMoodlenetVerifyWebfinger200Response> ToolMoodlenetVerifyWebfingerAsync(ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<ToolMoodlenetVerifyWebfinger200Response> localVarResponse = await ToolMoodlenetVerifyWebfingerWithHttpInfoAsync(toolMoodlenetVerifyWebfingerRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Verify if the passed information resolves into a WebFinger profile URL Verify if the passed information resolves into a WebFinger profile URL
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="toolMoodlenetVerifyWebfingerRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ToolMoodlenetVerifyWebfinger200Response)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<ToolMoodlenetVerifyWebfinger200Response>> ToolMoodlenetVerifyWebfingerWithHttpInfoAsync(ToolMoodlenetVerifyWebfingerRequest toolMoodlenetVerifyWebfingerRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'toolMoodlenetVerifyWebfingerRequest' is set
            if (toolMoodlenetVerifyWebfingerRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'toolMoodlenetVerifyWebfingerRequest' when calling ToolMoodlenetApi->ToolMoodlenetVerifyWebfinger");
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

            localVarRequestOptions.Data = toolMoodlenetVerifyWebfingerRequest;

            localVarRequestOptions.Operation = "ToolMoodlenetApi.ToolMoodlenetVerifyWebfinger";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<ToolMoodlenetVerifyWebfinger200Response>("/tool_moodlenet_verify_webfinger", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ToolMoodlenetVerifyWebfinger", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
