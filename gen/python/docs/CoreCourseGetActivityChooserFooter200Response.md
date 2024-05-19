# CoreCourseGetActivityChooserFooter200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customcarouseltemplate** | **str** | Either \&quot;\&quot; or the prerendered carousel page | [optional] [default to 'null']
**customfooterjs** | **str** | The path to the plugin JS file | [optional] [default to 'null']
**customfootertemplate** | **str** | The prerendered footer | [optional] [default to 'null']
**footer** | **bool** | Is a footer being return by this request? | [default to False]

## Example

```python
from openapi_client.models.core_course_get_activity_chooser_footer200_response import CoreCourseGetActivityChooserFooter200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCourseGetActivityChooserFooter200Response from a JSON string
core_course_get_activity_chooser_footer200_response_instance = CoreCourseGetActivityChooserFooter200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCourseGetActivityChooserFooter200Response.to_json())

# convert the object into a dict
core_course_get_activity_chooser_footer200_response_dict = core_course_get_activity_chooser_footer200_response_instance.to_dict()
# create an instance of CoreCourseGetActivityChooserFooter200Response from a dict
core_course_get_activity_chooser_footer200_response_from_dict = CoreCourseGetActivityChooserFooter200Response.from_dict(core_course_get_activity_chooser_footer200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


