# \QbankColumnsortorderApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qbank_columnsortorder_set_column_size**](QbankColumnsortorderApi.md#qbank_columnsortorder_set_column_size) | **POST** /qbank_columnsortorder_set_column_size | Column size
[**qbank_columnsortorder_set_columnbank_order**](QbankColumnsortorderApi.md#qbank_columnsortorder_set_columnbank_order) | **POST** /qbank_columnsortorder_set_columnbank_order | Sets question columns order in database
[**qbank_columnsortorder_set_hidden_columns**](QbankColumnsortorderApi.md#qbank_columnsortorder_set_hidden_columns) | **POST** /qbank_columnsortorder_set_hidden_columns | Hidden Columns



## qbank_columnsortorder_set_column_size

> serde_json::Value qbank_columnsortorder_set_column_size(qbank_columnsortorder_set_column_size_request)
Column size

Column size

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**qbank_columnsortorder_set_column_size_request** | [**QbankColumnsortorderSetColumnSizeRequest**](QbankColumnsortorderSetColumnSizeRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qbank_columnsortorder_set_columnbank_order

> serde_json::Value qbank_columnsortorder_set_columnbank_order(qbank_columnsortorder_set_columnbank_order_request)
Sets question columns order in database

Sets question columns order in database

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**qbank_columnsortorder_set_columnbank_order_request** | [**QbankColumnsortorderSetColumnbankOrderRequest**](QbankColumnsortorderSetColumnbankOrderRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## qbank_columnsortorder_set_hidden_columns

> serde_json::Value qbank_columnsortorder_set_hidden_columns(qbank_columnsortorder_set_hidden_columns_request)
Hidden Columns

Hidden Columns

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**qbank_columnsortorder_set_hidden_columns_request** | [**QbankColumnsortorderSetHiddenColumnsRequest**](QbankColumnsortorderSetHiddenColumnsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

