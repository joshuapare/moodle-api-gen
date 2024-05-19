# MoodleClient.Api.PaygwPaypalApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**PaygwPaypalCreateTransactionComplete**](PaygwPaypalApi.md#paygwpaypalcreatetransactioncomplete) | **POST** /paygw_paypal_create_transaction_complete | Takes care of what needs to be done when a PayPal transaction comes back as complete. |
| [**PaygwPaypalGetConfigForJs**](PaygwPaypalApi.md#paygwpaypalgetconfigforjs) | **POST** /paygw_paypal_get_config_for_js | Returns the configuration settings to be used in js |

<a id="paygwpaypalcreatetransactioncomplete"></a>
# **PaygwPaypalCreateTransactionComplete**
> PaygwPaypalCreateTransactionComplete200Response PaygwPaypalCreateTransactionComplete (PaygwPaypalCreateTransactionCompleteRequest paygwPaypalCreateTransactionCompleteRequest)

Takes care of what needs to be done when a PayPal transaction comes back as complete.

Takes care of what needs to be done when a PayPal transaction comes back as complete.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class PaygwPaypalCreateTransactionCompleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PaygwPaypalApi(config);
            var paygwPaypalCreateTransactionCompleteRequest = new PaygwPaypalCreateTransactionCompleteRequest(); // PaygwPaypalCreateTransactionCompleteRequest | 

            try
            {
                // Takes care of what needs to be done when a PayPal transaction comes back as complete.
                PaygwPaypalCreateTransactionComplete200Response result = apiInstance.PaygwPaypalCreateTransactionComplete(paygwPaypalCreateTransactionCompleteRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PaygwPaypalApi.PaygwPaypalCreateTransactionComplete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PaygwPaypalCreateTransactionCompleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Takes care of what needs to be done when a PayPal transaction comes back as complete.
    ApiResponse<PaygwPaypalCreateTransactionComplete200Response> response = apiInstance.PaygwPaypalCreateTransactionCompleteWithHttpInfo(paygwPaypalCreateTransactionCompleteRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PaygwPaypalApi.PaygwPaypalCreateTransactionCompleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **paygwPaypalCreateTransactionCompleteRequest** | [**PaygwPaypalCreateTransactionCompleteRequest**](PaygwPaypalCreateTransactionCompleteRequest.md) |  |  |

### Return type

[**PaygwPaypalCreateTransactionComplete200Response**](PaygwPaypalCreateTransactionComplete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="paygwpaypalgetconfigforjs"></a>
# **PaygwPaypalGetConfigForJs**
> PaygwPaypalGetConfigForJs200Response PaygwPaypalGetConfigForJs (PaygwPaypalGetConfigForJsRequest paygwPaypalGetConfigForJsRequest)

Returns the configuration settings to be used in js

Returns the configuration settings to be used in js

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class PaygwPaypalGetConfigForJsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PaygwPaypalApi(config);
            var paygwPaypalGetConfigForJsRequest = new PaygwPaypalGetConfigForJsRequest(); // PaygwPaypalGetConfigForJsRequest | 

            try
            {
                // Returns the configuration settings to be used in js
                PaygwPaypalGetConfigForJs200Response result = apiInstance.PaygwPaypalGetConfigForJs(paygwPaypalGetConfigForJsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PaygwPaypalApi.PaygwPaypalGetConfigForJs: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PaygwPaypalGetConfigForJsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the configuration settings to be used in js
    ApiResponse<PaygwPaypalGetConfigForJs200Response> response = apiInstance.PaygwPaypalGetConfigForJsWithHttpInfo(paygwPaypalGetConfigForJsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PaygwPaypalApi.PaygwPaypalGetConfigForJsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **paygwPaypalGetConfigForJsRequest** | [**PaygwPaypalGetConfigForJsRequest**](PaygwPaypalGetConfigForJsRequest.md) |  |  |

### Return type

[**PaygwPaypalGetConfigForJs200Response**](PaygwPaypalGetConfigForJs200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Invalid parameter value detected |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

