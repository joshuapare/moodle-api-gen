# ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contenthash** | **str** | Sha1 hash of file content. | [optional] [default to 'null']
**context** | **int** | context | [optional] [default to null]
**course** | **int** | Course id this h5p activity is part of. | [optional] [default to null]
**coursemodule** | **int** | coursemodule | [optional] 
**deployedfile** | [**ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile**](ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile.md) |  | [optional] 
**displayoptions** | **int** | H5P Button display options. | [optional] [default to 0]
**enabletracking** | **int** | Enable xAPI tracking. | [optional] [default to 1]
**grade** | **int** | The maximum grade for submission. | [optional] [default to 0]
**grademethod** | **int** | Which H5P attempt is used for grading. | [optional] [default to 1]
**id** | **int** | The primary key of the record. | [optional] 
**intro** | **str** | H5P activity description. | [optional] [default to '']
**introfiles** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**name** | **str** | The name of the activity module instance. | [optional] [default to 'null']
**package** | [**List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**timecreated** | **int** | Timestamp of when the instance was added to the course. | [optional] [default to null]
**timemodified** | **int** | Timestamp of when the instance was last modified. | [optional] [default to null]

## Example

```python
from openapi_client.models.mod_h5pactivity_get_h5pactivities_by_courses200_response_h5pactivities_inner import ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner from a JSON string
mod_h5pactivity_get_h5pactivities_by_courses200_response_h5pactivities_inner_instance = ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.to_json())

# convert the object into a dict
mod_h5pactivity_get_h5pactivities_by_courses200_response_h5pactivities_inner_dict = mod_h5pactivity_get_h5pactivities_by_courses200_response_h5pactivities_inner_instance.to_dict()
# create an instance of ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner from a dict
mod_h5pactivity_get_h5pactivities_by_courses200_response_h5pactivities_inner_from_dict = ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.from_dict(mod_h5pactivity_get_h5pactivities_by_courses200_response_h5pactivities_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


