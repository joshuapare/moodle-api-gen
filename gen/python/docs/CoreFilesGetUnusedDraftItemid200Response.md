# CoreFilesGetUnusedDraftItemid200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **str** | File area component. | [default to 'null']
**contextid** | **int** | File area context. | [default to null]
**filearea** | **str** | File area name. | [default to 'null']
**itemid** | **int** | File are item id. | [default to null]
**userid** | **int** | File area user id. | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_files_get_unused_draft_itemid200_response import CoreFilesGetUnusedDraftItemid200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFilesGetUnusedDraftItemid200Response from a JSON string
core_files_get_unused_draft_itemid200_response_instance = CoreFilesGetUnusedDraftItemid200Response.from_json(json)
# print the JSON string representation of the object
print(CoreFilesGetUnusedDraftItemid200Response.to_json())

# convert the object into a dict
core_files_get_unused_draft_itemid200_response_dict = core_files_get_unused_draft_itemid200_response_instance.to_dict()
# create an instance of CoreFilesGetUnusedDraftItemid200Response from a dict
core_files_get_unused_draft_itemid200_response_from_dict = CoreFilesGetUnusedDraftItemid200Response.from_dict(core_files_get_unused_draft_itemid200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


