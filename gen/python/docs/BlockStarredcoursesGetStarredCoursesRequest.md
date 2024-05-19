# BlockStarredcoursesGetStarredCoursesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** | Limit | [optional] [default to 0]
**offset** | **int** | Offset | [optional] [default to 0]

## Example

```python
from openapi_client.models.block_starredcourses_get_starred_courses_request import BlockStarredcoursesGetStarredCoursesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockStarredcoursesGetStarredCoursesRequest from a JSON string
block_starredcourses_get_starred_courses_request_instance = BlockStarredcoursesGetStarredCoursesRequest.from_json(json)
# print the JSON string representation of the object
print(BlockStarredcoursesGetStarredCoursesRequest.to_json())

# convert the object into a dict
block_starredcourses_get_starred_courses_request_dict = block_starredcourses_get_starred_courses_request_instance.to_dict()
# create an instance of BlockStarredcoursesGetStarredCoursesRequest from a dict
block_starredcourses_get_starred_courses_request_from_dict = BlockStarredcoursesGetStarredCoursesRequest.from_dict(block_starredcourses_get_starred_courses_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


