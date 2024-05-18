# CoreTagGetTagindexRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tagindex** | [**CoreTagGetTagindexRequestTagindex**](CoreTagGetTagindexRequestTagindex.md) |  | 

## Example

```python
from openapi_client.models.core_tag_get_tagindex_request import CoreTagGetTagindexRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTagindexRequest from a JSON string
core_tag_get_tagindex_request_instance = CoreTagGetTagindexRequest.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTagindexRequest.to_json())

# convert the object into a dict
core_tag_get_tagindex_request_dict = core_tag_get_tagindex_request_instance.to_dict()
# create an instance of CoreTagGetTagindexRequest from a dict
core_tag_get_tagindex_request_from_dict = CoreTagGetTagindexRequest.from_dict(core_tag_get_tagindex_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


