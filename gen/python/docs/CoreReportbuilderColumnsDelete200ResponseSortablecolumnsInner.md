# CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**heading** | **str** | heading | [optional] 
**id** | **int** | id | [optional] 
**movetitle** | **str** | movetitle | [optional] 
**sortdirection** | **int** | sortdirection | [optional] 
**sortenabled** | **bool** | sortenabled | [optional] 
**sortenabledtitle** | **str** | sortenabledtitle | [optional] 
**sorticon** | [**CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon**](CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon.md) |  | [optional] 
**sortorder** | **int** | sortorder | [optional] 
**title** | **str** | title | [optional] 

## Example

```python
from openapi_client.models.core_reportbuilder_columns_delete200_response_sortablecolumns_inner import CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner from a JSON string
core_reportbuilder_columns_delete200_response_sortablecolumns_inner_instance = CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner.to_json())

# convert the object into a dict
core_reportbuilder_columns_delete200_response_sortablecolumns_inner_dict = core_reportbuilder_columns_delete200_response_sortablecolumns_inner_instance.to_dict()
# create an instance of CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner from a dict
core_reportbuilder_columns_delete200_response_sortablecolumns_inner_from_dict = CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner.from_dict(core_reportbuilder_columns_delete200_response_sortablecolumns_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


