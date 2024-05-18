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
    public interface IEnrolManualApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Manual enrol users
        /// </summary>
        /// <remarks>
        /// Manual enrol users
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualEnrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Object</returns>
        Object EnrolManualEnrolUsers(EnrolManualEnrolUsersRequest enrolManualEnrolUsersRequest, int operationIndex = 0);

        /// <summary>
        /// Manual enrol users
        /// </summary>
        /// <remarks>
        /// Manual enrol users
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualEnrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object</returns>
        ApiResponse<Object> EnrolManualEnrolUsersWithHttpInfo(EnrolManualEnrolUsersRequest enrolManualEnrolUsersRequest, int operationIndex = 0);
        /// <summary>
        /// Manual unenrol users
        /// </summary>
        /// <remarks>
        /// Manual unenrol users
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualUnenrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Object</returns>
        Object EnrolManualUnenrolUsers(EnrolManualUnenrolUsersRequest enrolManualUnenrolUsersRequest, int operationIndex = 0);

        /// <summary>
        /// Manual unenrol users
        /// </summary>
        /// <remarks>
        /// Manual unenrol users
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualUnenrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object</returns>
        ApiResponse<Object> EnrolManualUnenrolUsersWithHttpInfo(EnrolManualUnenrolUsersRequest enrolManualUnenrolUsersRequest, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEnrolManualApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Manual enrol users
        /// </summary>
        /// <remarks>
        /// Manual enrol users
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualEnrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Object</returns>
        System.Threading.Tasks.Task<Object> EnrolManualEnrolUsersAsync(EnrolManualEnrolUsersRequest enrolManualEnrolUsersRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Manual enrol users
        /// </summary>
        /// <remarks>
        /// Manual enrol users
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualEnrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> EnrolManualEnrolUsersWithHttpInfoAsync(EnrolManualEnrolUsersRequest enrolManualEnrolUsersRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Manual unenrol users
        /// </summary>
        /// <remarks>
        /// Manual unenrol users
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualUnenrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Object</returns>
        System.Threading.Tasks.Task<Object> EnrolManualUnenrolUsersAsync(EnrolManualUnenrolUsersRequest enrolManualUnenrolUsersRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Manual unenrol users
        /// </summary>
        /// <remarks>
        /// Manual unenrol users
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualUnenrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> EnrolManualUnenrolUsersWithHttpInfoAsync(EnrolManualUnenrolUsersRequest enrolManualUnenrolUsersRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEnrolManualApi : IEnrolManualApiSync, IEnrolManualApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class EnrolManualApi : IEnrolManualApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="EnrolManualApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EnrolManualApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EnrolManualApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EnrolManualApi(string basePath)
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
        /// Initializes a new instance of the <see cref="EnrolManualApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public EnrolManualApi(Org.OpenAPITools.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="EnrolManualApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public EnrolManualApi(Org.OpenAPITools.Client.ISynchronousClient client, Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
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
        /// Manual enrol users Manual enrol users
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualEnrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Object</returns>
        public Object EnrolManualEnrolUsers(EnrolManualEnrolUsersRequest enrolManualEnrolUsersRequest, int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<Object> localVarResponse = EnrolManualEnrolUsersWithHttpInfo(enrolManualEnrolUsersRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Manual enrol users Manual enrol users
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualEnrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object</returns>
        public Org.OpenAPITools.Client.ApiResponse<Object> EnrolManualEnrolUsersWithHttpInfo(EnrolManualEnrolUsersRequest enrolManualEnrolUsersRequest, int operationIndex = 0)
        {
            // verify the required parameter 'enrolManualEnrolUsersRequest' is set
            if (enrolManualEnrolUsersRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'enrolManualEnrolUsersRequest' when calling EnrolManualApi->EnrolManualEnrolUsers");
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

            localVarRequestOptions.Data = enrolManualEnrolUsersRequest;

            localVarRequestOptions.Operation = "EnrolManualApi.EnrolManualEnrolUsers";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<Object>("/enrol_manual_enrol_users", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("EnrolManualEnrolUsers", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Manual enrol users Manual enrol users
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualEnrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Object</returns>
        public async System.Threading.Tasks.Task<Object> EnrolManualEnrolUsersAsync(EnrolManualEnrolUsersRequest enrolManualEnrolUsersRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<Object> localVarResponse = await EnrolManualEnrolUsersWithHttpInfoAsync(enrolManualEnrolUsersRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Manual enrol users Manual enrol users
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualEnrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> EnrolManualEnrolUsersWithHttpInfoAsync(EnrolManualEnrolUsersRequest enrolManualEnrolUsersRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'enrolManualEnrolUsersRequest' is set
            if (enrolManualEnrolUsersRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'enrolManualEnrolUsersRequest' when calling EnrolManualApi->EnrolManualEnrolUsers");
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

            localVarRequestOptions.Data = enrolManualEnrolUsersRequest;

            localVarRequestOptions.Operation = "EnrolManualApi.EnrolManualEnrolUsers";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<Object>("/enrol_manual_enrol_users", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("EnrolManualEnrolUsers", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Manual unenrol users Manual unenrol users
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualUnenrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Object</returns>
        public Object EnrolManualUnenrolUsers(EnrolManualUnenrolUsersRequest enrolManualUnenrolUsersRequest, int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<Object> localVarResponse = EnrolManualUnenrolUsersWithHttpInfo(enrolManualUnenrolUsersRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Manual unenrol users Manual unenrol users
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualUnenrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object</returns>
        public Org.OpenAPITools.Client.ApiResponse<Object> EnrolManualUnenrolUsersWithHttpInfo(EnrolManualUnenrolUsersRequest enrolManualUnenrolUsersRequest, int operationIndex = 0)
        {
            // verify the required parameter 'enrolManualUnenrolUsersRequest' is set
            if (enrolManualUnenrolUsersRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'enrolManualUnenrolUsersRequest' when calling EnrolManualApi->EnrolManualUnenrolUsers");
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

            localVarRequestOptions.Data = enrolManualUnenrolUsersRequest;

            localVarRequestOptions.Operation = "EnrolManualApi.EnrolManualUnenrolUsers";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<Object>("/enrol_manual_unenrol_users", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("EnrolManualUnenrolUsers", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Manual unenrol users Manual unenrol users
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualUnenrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Object</returns>
        public async System.Threading.Tasks.Task<Object> EnrolManualUnenrolUsersAsync(EnrolManualUnenrolUsersRequest enrolManualUnenrolUsersRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<Object> localVarResponse = await EnrolManualUnenrolUsersWithHttpInfoAsync(enrolManualUnenrolUsersRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Manual unenrol users Manual unenrol users
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enrolManualUnenrolUsersRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> EnrolManualUnenrolUsersWithHttpInfoAsync(EnrolManualUnenrolUsersRequest enrolManualUnenrolUsersRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'enrolManualUnenrolUsersRequest' is set
            if (enrolManualUnenrolUsersRequest == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'enrolManualUnenrolUsersRequest' when calling EnrolManualApi->EnrolManualUnenrolUsers");
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

            localVarRequestOptions.Data = enrolManualUnenrolUsersRequest;

            localVarRequestOptions.Operation = "EnrolManualApi.EnrolManualUnenrolUsers";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (apiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("Authorization")))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", this.Configuration.GetApiKeyWithPrefix("Authorization"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<Object>("/enrol_manual_unenrol_users", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("EnrolManualUnenrolUsers", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}