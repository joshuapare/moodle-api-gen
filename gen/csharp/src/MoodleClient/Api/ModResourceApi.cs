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
    public interface IModResourceApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </summary>
        /// <remarks>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ModResourceGetResourcesByCourses200Response</returns>
        ModResourceGetResourcesByCourses200Response ModResourceGetResourcesByCourses(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, int operationIndex = 0);

        /// <summary>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </summary>
        /// <remarks>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of ModResourceGetResourcesByCourses200Response</returns>
        ApiResponse<ModResourceGetResourcesByCourses200Response> ModResourceGetResourcesByCoursesWithHttpInfo(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, int operationIndex = 0);
        /// <summary>
        /// Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </summary>
        /// <remarks>
        /// Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modResourceViewResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>CoreCalendarDeleteSubscription200Response</returns>
        CoreCalendarDeleteSubscription200Response ModResourceViewResource(ModResourceViewResourceRequest modResourceViewResourceRequest, int operationIndex = 0);

        /// <summary>
        /// Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </summary>
        /// <remarks>
        /// Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modResourceViewResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of CoreCalendarDeleteSubscription200Response</returns>
        ApiResponse<CoreCalendarDeleteSubscription200Response> ModResourceViewResourceWithHttpInfo(ModResourceViewResourceRequest modResourceViewResourceRequest, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IModResourceApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </summary>
        /// <remarks>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ModResourceGetResourcesByCourses200Response</returns>
        System.Threading.Tasks.Task<ModResourceGetResourcesByCourses200Response> ModResourceGetResourcesByCoursesAsync(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </summary>
        /// <remarks>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ModResourceGetResourcesByCourses200Response)</returns>
        System.Threading.Tasks.Task<ApiResponse<ModResourceGetResourcesByCourses200Response>> ModResourceGetResourcesByCoursesWithHttpInfoAsync(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </summary>
        /// <remarks>
        /// Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modResourceViewResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of CoreCalendarDeleteSubscription200Response</returns>
        System.Threading.Tasks.Task<CoreCalendarDeleteSubscription200Response> ModResourceViewResourceAsync(ModResourceViewResourceRequest modResourceViewResourceRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </summary>
        /// <remarks>
        /// Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </remarks>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modResourceViewResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (CoreCalendarDeleteSubscription200Response)</returns>
        System.Threading.Tasks.Task<ApiResponse<CoreCalendarDeleteSubscription200Response>> ModResourceViewResourceWithHttpInfoAsync(ModResourceViewResourceRequest modResourceViewResourceRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IModResourceApi : IModResourceApiSync, IModResourceApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ModResourceApi : IModResourceApi
    {
        private MoodleClient.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ModResourceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ModResourceApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ModResourceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ModResourceApi(string basePath)
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
        /// Initializes a new instance of the <see cref="ModResourceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ModResourceApi(MoodleClient.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="ModResourceApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ModResourceApi(MoodleClient.Client.ISynchronousClient client, MoodleClient.Client.IAsynchronousClient asyncClient, MoodleClient.Client.IReadableConfiguration configuration)
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
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned. Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ModResourceGetResourcesByCourses200Response</returns>
        public ModResourceGetResourcesByCourses200Response ModResourceGetResourcesByCourses(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, int operationIndex = 0)
        {
            MoodleClient.Client.ApiResponse<ModResourceGetResourcesByCourses200Response> localVarResponse = ModResourceGetResourcesByCoursesWithHttpInfo(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned. Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of ModResourceGetResourcesByCourses200Response</returns>
        public MoodleClient.Client.ApiResponse<ModResourceGetResourcesByCourses200Response> ModResourceGetResourcesByCoursesWithHttpInfo(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, int operationIndex = 0)
        {
            // verify the required parameter 'modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest' is set
            if (modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest == null)
            {
                throw new MoodleClient.Client.ApiException(400, "Missing required parameter 'modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest' when calling ModResourceApi->ModResourceGetResourcesByCourses");
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

            localVarRequestOptions.Data = modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest;

            localVarRequestOptions.Operation = "ModResourceApi.ModResourceGetResourcesByCourses";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<ModResourceGetResourcesByCourses200Response>("/mod_resource_get_resources_by_courses", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ModResourceGetResourcesByCourses", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned. Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ModResourceGetResourcesByCourses200Response</returns>
        public async System.Threading.Tasks.Task<ModResourceGetResourcesByCourses200Response> ModResourceGetResourcesByCoursesAsync(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            MoodleClient.Client.ApiResponse<ModResourceGetResourcesByCourses200Response> localVarResponse = await ModResourceGetResourcesByCoursesWithHttpInfoAsync(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned. Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ModResourceGetResourcesByCourses200Response)</returns>
        public async System.Threading.Tasks.Task<MoodleClient.Client.ApiResponse<ModResourceGetResourcesByCourses200Response>> ModResourceGetResourcesByCoursesWithHttpInfoAsync(ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest' is set
            if (modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest == null)
            {
                throw new MoodleClient.Client.ApiException(400, "Missing required parameter 'modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest' when calling ModResourceApi->ModResourceGetResourcesByCourses");
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

            localVarRequestOptions.Data = modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest;

            localVarRequestOptions.Operation = "ModResourceApi.ModResourceGetResourcesByCourses";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<ModResourceGetResourcesByCourses200Response>("/mod_resource_get_resources_by_courses", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ModResourceGetResourcesByCourses", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Simulate the view.php web interface resource: trigger events, completion, etc... Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modResourceViewResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>CoreCalendarDeleteSubscription200Response</returns>
        public CoreCalendarDeleteSubscription200Response ModResourceViewResource(ModResourceViewResourceRequest modResourceViewResourceRequest, int operationIndex = 0)
        {
            MoodleClient.Client.ApiResponse<CoreCalendarDeleteSubscription200Response> localVarResponse = ModResourceViewResourceWithHttpInfo(modResourceViewResourceRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Simulate the view.php web interface resource: trigger events, completion, etc... Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modResourceViewResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of CoreCalendarDeleteSubscription200Response</returns>
        public MoodleClient.Client.ApiResponse<CoreCalendarDeleteSubscription200Response> ModResourceViewResourceWithHttpInfo(ModResourceViewResourceRequest modResourceViewResourceRequest, int operationIndex = 0)
        {
            // verify the required parameter 'modResourceViewResourceRequest' is set
            if (modResourceViewResourceRequest == null)
            {
                throw new MoodleClient.Client.ApiException(400, "Missing required parameter 'modResourceViewResourceRequest' when calling ModResourceApi->ModResourceViewResource");
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

            localVarRequestOptions.Data = modResourceViewResourceRequest;

            localVarRequestOptions.Operation = "ModResourceApi.ModResourceViewResource";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<CoreCalendarDeleteSubscription200Response>("/mod_resource_view_resource", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ModResourceViewResource", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Simulate the view.php web interface resource: trigger events, completion, etc... Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modResourceViewResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of CoreCalendarDeleteSubscription200Response</returns>
        public async System.Threading.Tasks.Task<CoreCalendarDeleteSubscription200Response> ModResourceViewResourceAsync(ModResourceViewResourceRequest modResourceViewResourceRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            MoodleClient.Client.ApiResponse<CoreCalendarDeleteSubscription200Response> localVarResponse = await ModResourceViewResourceWithHttpInfoAsync(modResourceViewResourceRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Simulate the view.php web interface resource: trigger events, completion, etc... Simulate the view.php web interface resource: trigger events, completion, etc...
        /// </summary>
        /// <exception cref="MoodleClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="modResourceViewResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (CoreCalendarDeleteSubscription200Response)</returns>
        public async System.Threading.Tasks.Task<MoodleClient.Client.ApiResponse<CoreCalendarDeleteSubscription200Response>> ModResourceViewResourceWithHttpInfoAsync(ModResourceViewResourceRequest modResourceViewResourceRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'modResourceViewResourceRequest' is set
            if (modResourceViewResourceRequest == null)
            {
                throw new MoodleClient.Client.ApiException(400, "Missing required parameter 'modResourceViewResourceRequest' when calling ModResourceApi->ModResourceViewResource");
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

            localVarRequestOptions.Data = modResourceViewResourceRequest;

            localVarRequestOptions.Operation = "ModResourceApi.ModResourceViewResource";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<CoreCalendarDeleteSubscription200Response>("/mod_resource_view_resource", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ModResourceViewResource", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}