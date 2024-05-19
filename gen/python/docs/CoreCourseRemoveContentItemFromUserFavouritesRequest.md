# CoreCourseRemoveContentItemFromUserFavouritesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**componentname** | **str** | frankenstyle name of the component to which the content item belongs | 
**contentitemid** | **int** | id of the content item | [default to ]

## Example

```python
from openapi_client.models.core_course_remove_content_item_from_user_favourites_request import CoreCourseRemoveContentItemFromUserFavouritesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseRemoveContentItemFromUserFavouritesRequest from a JSON string
core_course_remove_content_item_from_user_favourites_request_instance = CoreCourseRemoveContentItemFromUserFavouritesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseRemoveContentItemFromUserFavouritesRequest.to_json())

# convert the object into a dict
core_course_remove_content_item_from_user_favourites_request_dict = core_course_remove_content_item_from_user_favourites_request_instance.to_dict()
# create an instance of CoreCourseRemoveContentItemFromUserFavouritesRequest from a dict
core_course_remove_content_item_from_user_favourites_request_from_dict = CoreCourseRemoveContentItemFromUserFavouritesRequest.from_dict(core_course_remove_content_item_from_user_favourites_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


