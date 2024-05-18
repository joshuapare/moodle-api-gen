# CoreCourseAddContentItemToUserFavourites200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archetype** | **str** | The archetype of the module exposing the content item | [default to 'null']
**componentname** | **str** | The name of the component exposing the content item | [default to 'null']
**favourite** | **bool** | Has the user favourited the content item | [default to False]
**help** | **str** | Html description / help for the content item | [default to 'null']
**icon** | **str** | Html containing the icon for the content item | [default to 'null']
**id** | **int** | The id of the content item | [default to null]
**legacyitem** | **bool** | If this item was pulled from the old callback and has no item id. | [default to False]
**link** | **str** | The link to the content item creation page | [default to 'null']
**name** | **str** | Name of the content item | [default to 'null']
**purpose** | **str** | The purpose of the component exposing the content item | [default to 'null']
**recommended** | **bool** | Has this item been recommended | [default to False]
**title** | **str** | The string title of the content item, human readable | [default to 'null']

## Example

```python
from openapi_client.models.core_course_add_content_item_to_user_favourites200_response import CoreCourseAddContentItemToUserFavourites200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseAddContentItemToUserFavourites200Response from a JSON string
core_course_add_content_item_to_user_favourites200_response_instance = CoreCourseAddContentItemToUserFavourites200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseAddContentItemToUserFavourites200Response.to_json())

# convert the object into a dict
core_course_add_content_item_to_user_favourites200_response_dict = core_course_add_content_item_to_user_favourites200_response_instance.to_dict()
# create an instance of CoreCourseAddContentItemToUserFavourites200Response from a dict
core_course_add_content_item_to_user_favourites200_response_from_dict = CoreCourseAddContentItemToUserFavourites200Response.from_dict(core_course_add_content_item_to_user_favourites200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


