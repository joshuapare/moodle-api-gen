# CoreTagGetTagindexRequestTagindex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ctx** | **int** | context id where to search for items | [optional] [default to 0]
**excl** | **bool** | exlusive mode for this tag area | [optional] [default to False]
**var_from** | **int** | context id where the link was displayed | [optional] [default to 0]
**page** | **int** | page number (0-based) | [optional] [default to 0]
**rec** | **int** | search in the context recursive | [optional] [default to 1]
**ta** | **int** | tag area id | [default to null]
**tag** | **str** | tag name | [default to 'null']
**tc** | **int** | tag collection id | [default to null]

## Example

```python
from openapi_client.models.core_tag_get_tagindex_request_tagindex import CoreTagGetTagindexRequestTagindex

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTagindexRequestTagindex from a JSON string
core_tag_get_tagindex_request_tagindex_instance = CoreTagGetTagindexRequestTagindex.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTagindexRequestTagindex.to_json())

# convert the object into a dict
core_tag_get_tagindex_request_tagindex_dict = core_tag_get_tagindex_request_tagindex_instance.to_dict()
# create an instance of CoreTagGetTagindexRequestTagindex from a dict
core_tag_get_tagindex_request_tagindex_from_dict = CoreTagGetTagindexRequestTagindex.from_dict(core_tag_get_tagindex_request_tagindex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


