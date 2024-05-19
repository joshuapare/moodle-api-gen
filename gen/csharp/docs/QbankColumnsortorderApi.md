# MoodleClient.Api.QbankColumnsortorderApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**QbankColumnsortorderSetColumnSize**](QbankColumnsortorderApi.md#qbankcolumnsortordersetcolumnsize) | **POST** /qbank_columnsortorder_set_column_size | Column size |
| [**QbankColumnsortorderSetColumnbankOrder**](QbankColumnsortorderApi.md#qbankcolumnsortordersetcolumnbankorder) | **POST** /qbank_columnsortorder_set_columnbank_order | Sets question columns order in database |
| [**QbankColumnsortorderSetHiddenColumns**](QbankColumnsortorderApi.md#qbankcolumnsortordersethiddencolumns) | **POST** /qbank_columnsortorder_set_hidden_columns | Hidden Columns |

<a id="qbankcolumnsortordersetcolumnsize"></a>
# **QbankColumnsortorderSetColumnSize**
> Object QbankColumnsortorderSetColumnSize (QbankColumnsortorderSetColumnSizeRequest qbankColumnsortorderSetColumnSizeRequest)

Column size

Column size

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class QbankColumnsortorderSetColumnSizeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new QbankColumnsortorderApi(config);
            var qbankColumnsortorderSetColumnSizeRequest = new QbankColumnsortorderSetColumnSizeRequest(); // QbankColumnsortorderSetColumnSizeRequest | 

            try
            {
                // Column size
                Object result = apiInstance.QbankColumnsortorderSetColumnSize(qbankColumnsortorderSetColumnSizeRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling QbankColumnsortorderApi.QbankColumnsortorderSetColumnSize: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the QbankColumnsortorderSetColumnSizeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Column size
    ApiResponse<Object> response = apiInstance.QbankColumnsortorderSetColumnSizeWithHttpInfo(qbankColumnsortorderSetColumnSizeRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling QbankColumnsortorderApi.QbankColumnsortorderSetColumnSizeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **qbankColumnsortorderSetColumnSizeRequest** | [**QbankColumnsortorderSetColumnSizeRequest**](QbankColumnsortorderSetColumnSizeRequest.md) |  |  |

### Return type

**Object**

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

<a id="qbankcolumnsortordersetcolumnbankorder"></a>
# **QbankColumnsortorderSetColumnbankOrder**
> Object QbankColumnsortorderSetColumnbankOrder (QbankColumnsortorderSetColumnbankOrderRequest qbankColumnsortorderSetColumnbankOrderRequest)

Sets question columns order in database

Sets question columns order in database

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class QbankColumnsortorderSetColumnbankOrderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new QbankColumnsortorderApi(config);
            var qbankColumnsortorderSetColumnbankOrderRequest = new QbankColumnsortorderSetColumnbankOrderRequest(); // QbankColumnsortorderSetColumnbankOrderRequest | 

            try
            {
                // Sets question columns order in database
                Object result = apiInstance.QbankColumnsortorderSetColumnbankOrder(qbankColumnsortorderSetColumnbankOrderRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling QbankColumnsortorderApi.QbankColumnsortorderSetColumnbankOrder: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the QbankColumnsortorderSetColumnbankOrderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Sets question columns order in database
    ApiResponse<Object> response = apiInstance.QbankColumnsortorderSetColumnbankOrderWithHttpInfo(qbankColumnsortorderSetColumnbankOrderRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling QbankColumnsortorderApi.QbankColumnsortorderSetColumnbankOrderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **qbankColumnsortorderSetColumnbankOrderRequest** | [**QbankColumnsortorderSetColumnbankOrderRequest**](QbankColumnsortorderSetColumnbankOrderRequest.md) |  |  |

### Return type

**Object**

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

<a id="qbankcolumnsortordersethiddencolumns"></a>
# **QbankColumnsortorderSetHiddenColumns**
> Object QbankColumnsortorderSetHiddenColumns (QbankColumnsortorderSetHiddenColumnsRequest qbankColumnsortorderSetHiddenColumnsRequest)

Hidden Columns

Hidden Columns

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using MoodleClient.Api;
using MoodleClient.Client;
using MoodleClient.Model;

namespace Example
{
    public class QbankColumnsortorderSetHiddenColumnsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://localhost/webservice/restful/server.php";
            // Configure API key authorization: apiKey
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new QbankColumnsortorderApi(config);
            var qbankColumnsortorderSetHiddenColumnsRequest = new QbankColumnsortorderSetHiddenColumnsRequest(); // QbankColumnsortorderSetHiddenColumnsRequest | 

            try
            {
                // Hidden Columns
                Object result = apiInstance.QbankColumnsortorderSetHiddenColumns(qbankColumnsortorderSetHiddenColumnsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling QbankColumnsortorderApi.QbankColumnsortorderSetHiddenColumns: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the QbankColumnsortorderSetHiddenColumnsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Hidden Columns
    ApiResponse<Object> response = apiInstance.QbankColumnsortorderSetHiddenColumnsWithHttpInfo(qbankColumnsortorderSetHiddenColumnsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling QbankColumnsortorderApi.QbankColumnsortorderSetHiddenColumnsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **qbankColumnsortorderSetHiddenColumnsRequest** | [**QbankColumnsortorderSetHiddenColumnsRequest**](QbankColumnsortorderSetHiddenColumnsRequest.md) |  |  |

### Return type

**Object**

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

