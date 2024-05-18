# CoreReportbuilderColumnsAdd200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hassortablecolumns** | **bool** | hassortablecolumns | [default to False]
**helpicon** | **str** | helpicon | [default to 'null']
**sortablecolumns** | [**List[CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner]**](CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.md) |  | 

## Example

```python
from openapi_client.models.core_reportbuilder_columns_add200_response import CoreReportbuilderColumnsAdd200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreReportbuilderColumnsAdd200Response from a JSON string
core_reportbuilder_columns_add200_response_instance = CoreReportbuilderColumnsAdd200Response.from_json(json)
# print the JSON string representation of the object
print(CoreReportbuilderColumnsAdd200Response.to_json())

# convert the object into a dict
core_reportbuilder_columns_add200_response_dict = core_reportbuilder_columns_add200_response_instance.to_dict()
# create an instance of CoreReportbuilderColumnsAdd200Response from a dict
core_reportbuilder_columns_add200_response_from_dict = CoreReportbuilderColumnsAdd200Response.from_dict(core_reportbuilder_columns_add200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


