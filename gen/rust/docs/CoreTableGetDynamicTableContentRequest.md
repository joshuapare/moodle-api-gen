# CoreTableGetDynamicTableContentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **String** | Component | 
**filters** | Option<[**Vec<models::CoreTableGetDynamicTableContentRequestFiltersInner>**](core_table_get_dynamic_table_content_request_filters_inner.md)> |  | [optional]
**firstinitial** | **String** | The first initial to sort filter on | [default to null]
**handler** | **String** | Handler | [default to null]
**hiddencolumns** | [**Vec<serde_json::Value>**](serde_json::Value.md) |  | 
**jointype** | **i32** | Type of join to join all filters together | [default to null]
**lastinitial** | **String** | The last initial to sort filter on | [default to null]
**pagenumber** | **i32** | The page number | [default to null]
**pagesize** | **i32** | The number of records per page | [default to null]
**resetpreferences** | **bool** | Whether the table preferences should be reset | [default to null]
**sortdata** | Option<[**Vec<models::CoreTableGetDynamicTableContentRequestSortdataInner>**](core_table_get_dynamic_table_content_request_sortdata_inner.md)> |  | [optional]
**uniqueid** | **String** | Unique ID for the container | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


