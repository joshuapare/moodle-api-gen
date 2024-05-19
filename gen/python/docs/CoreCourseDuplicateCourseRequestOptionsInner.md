# CoreCourseDuplicateCourseRequestOptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The backup option name:                                             \&quot;activities\&quot; (int) Include course activites (default to 1 that is equal to yes),                                             \&quot;blocks\&quot; (int) Include course blocks (default to 1 that is equal to yes),                                             \&quot;filters\&quot; (int) Include course filters  (default to 1 that is equal to yes),                                             \&quot;users\&quot; (int) Include users (default to 0 that is equal to no),                                             \&quot;enrolments\&quot; (int) Include enrolment methods (default to 1 - restore only with users),                                             \&quot;role_assignments\&quot; (int) Include role assignments  (default to 0 that is equal to no),                                             \&quot;comments\&quot; (int) Include user comments  (default to 0 that is equal to no),                                             \&quot;userscompletion\&quot; (int) Include user course completion information  (default to 0 that is equal to no),                                             \&quot;logs\&quot; (int) Include course logs  (default to 0 that is equal to no),                                             \&quot;grade_histories\&quot; (int) Include histories  (default to 0 that is equal to no) | [optional] [default to 'null']
**value** | **str** | the value for the option 1 (yes) or 0 (no) | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_course_duplicate_course_request_options_inner import CoreCourseDuplicateCourseRequestOptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseDuplicateCourseRequestOptionsInner from a JSON string
core_course_duplicate_course_request_options_inner_instance = CoreCourseDuplicateCourseRequestOptionsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCourseDuplicateCourseRequestOptionsInner.to_json())

# convert the object into a dict
core_course_duplicate_course_request_options_inner_dict = core_course_duplicate_course_request_options_inner_instance.to_dict()
# create an instance of CoreCourseDuplicateCourseRequestOptionsInner from a dict
core_course_duplicate_course_request_options_inner_from_dict = CoreCourseDuplicateCourseRequestOptionsInner.from_dict(core_course_duplicate_course_request_options_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


