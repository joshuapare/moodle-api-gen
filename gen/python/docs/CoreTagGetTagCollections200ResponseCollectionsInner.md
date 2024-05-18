# CoreTagGetTagCollections200ResponseCollectionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | Component the collection is related to. | [optional] [default to 'null']
**customurl** | **str** | Custom URL for the tag page instead of /tag/index.php. | [optional] [default to 'null']
**id** | **int** | Collection id. | [optional] [default to null]
**isdefault** | **bool** | Whether is the default collection. | [optional] [default to False]
**name** | **str** | Collection name. | [optional] [default to 'null']
**searchable** | **bool** | Whether the tag collection is searchable. | [optional] [default to True]
**sortorder** | **int** | Collection ordering in the list. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_tag_get_tag_collections200_response_collections_inner import CoreTagGetTagCollections200ResponseCollectionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTagCollections200ResponseCollectionsInner from a JSON string
core_tag_get_tag_collections200_response_collections_inner_instance = CoreTagGetTagCollections200ResponseCollectionsInner.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTagCollections200ResponseCollectionsInner.to_json())

# convert the object into a dict
core_tag_get_tag_collections200_response_collections_inner_dict = core_tag_get_tag_collections200_response_collections_inner_instance.to_dict()
# create an instance of CoreTagGetTagCollections200ResponseCollectionsInner from a dict
core_tag_get_tag_collections200_response_collections_inner_from_dict = CoreTagGetTagCollections200ResponseCollectionsInner.from_dict(core_tag_get_tag_collections200_response_collections_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


