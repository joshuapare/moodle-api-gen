# ModForumPrepareDraftAreaForPost200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**areaoptions** | [**List[ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner]**](ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner.md) |  | 
**draftitemid** | **int** | Draft item id for the file area. | [default to null]
**files** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**messagetext** | **str** | Message text with URLs rewritten. | [default to 'null']
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_prepare_draft_area_for_post200_response import ModForumPrepareDraftAreaForPost200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumPrepareDraftAreaForPost200Response from a JSON string
mod_forum_prepare_draft_area_for_post200_response_instance = ModForumPrepareDraftAreaForPost200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumPrepareDraftAreaForPost200Response.to_json())

# convert the object into a dict
mod_forum_prepare_draft_area_for_post200_response_dict = mod_forum_prepare_draft_area_for_post200_response_instance.to_dict()
# create an instance of ModForumPrepareDraftAreaForPost200Response from a dict
mod_forum_prepare_draft_area_for_post200_response_from_dict = ModForumPrepareDraftAreaForPost200Response.from_dict(mod_forum_prepare_draft_area_for_post200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


