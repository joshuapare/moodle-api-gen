# CoreReportbuilderColumnsDelete200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hassortablecolumns** | **bool** | hassortablecolumns | 
**helpicon** | **str** | helpicon | 
**sortablecolumns** | [**List[CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner]**](CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner.md) |  | 

## Example

```python
from openapi_client.models.core_reportbuilder_columns_delete200_response import CoreReportbuilderColumnsDelete200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderColumnsDelete200Response from a JSON string
core_reportbuilder_columns_delete200_response_instance = CoreReportbuilderColumnsDelete200Response.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderColumnsDelete200Response.to_json())

# convert the object into a dict
core_reportbuilder_columns_delete200_response_dict = core_reportbuilder_columns_delete200_response_instance.to_dict()
# create an instance of CoreReportbuilderColumnsDelete200Response from a dict
core_reportbuilder_columns_delete200_response_from_dict = CoreReportbuilderColumnsDelete200Response.from_dict(core_reportbuilder_columns_delete200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


