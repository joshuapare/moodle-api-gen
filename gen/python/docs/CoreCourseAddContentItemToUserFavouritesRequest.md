# CoreCourseAddContentItemToUserFavouritesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**componentname** | **str** | frankenstyle name of the component to which the content item belongs | [default to 'null']
**contentitemid** | **int** | id of the content item | [default to ]

## Example

```python
from openapi_client.models.core_course_add_content_item_to_user_favourites_request import CoreCourseAddContentItemToUserFavouritesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseAddContentItemToUserFavouritesRequest from a JSON string
core_course_add_content_item_to_user_favourites_request_instance = CoreCourseAddContentItemToUserFavouritesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCourseAddContentItemToUserFavouritesRequest.to_json())

# convert the object into a dict
core_course_add_content_item_to_user_favourites_request_dict = core_course_add_content_item_to_user_favourites_request_instance.to_dict()
# create an instance of CoreCourseAddContentItemToUserFavouritesRequest from a dict
core_course_add_content_item_to_user_favourites_request_from_dict = CoreCourseAddContentItemToUserFavouritesRequest.from_dict(core_course_add_content_item_to_user_favourites_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


