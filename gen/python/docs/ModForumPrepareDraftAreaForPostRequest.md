# ModForumPrepareDraftAreaForPostRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | Area to prepare: attachment or post. | [default to 'null']
**draftitemid** | **int** | The draft item id to use. 0 to generate one. | [optional] [default to 0]
**filestokeep** | [**List[ModForumPrepareDraftAreaForPostRequestFilestokeepInner]**](ModForumPrepareDraftAreaForPostRequestFilestokeepInner.md) |  | [optional] 
**postid** | **int** | Post to prepare the draft area for. | [default to null]

## Example

```python
from openapi_client.models.mod_forum_prepare_draft_area_for_post_request import ModForumPrepareDraftAreaForPostRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumPrepareDraftAreaForPostRequest from a JSON string
mod_forum_prepare_draft_area_for_post_request_instance = ModForumPrepareDraftAreaForPostRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumPrepareDraftAreaForPostRequest.to_json())

# convert the object into a dict
mod_forum_prepare_draft_area_for_post_request_dict = mod_forum_prepare_draft_area_for_post_request_instance.to_dict()
# create an instance of ModForumPrepareDraftAreaForPostRequest from a dict
mod_forum_prepare_draft_area_for_post_request_from_dict = ModForumPrepareDraftAreaForPostRequest.from_dict(mod_forum_prepare_draft_area_for_post_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


