# CoreCompetencySetCourseCompetencyRuleoutcomeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coursecompetencyid** | **int** | Data base record id for the course competency | [default to null]
**ruleoutcome** | **int** | Ruleoutcome value | [default to null]

## Example

```python
from openapi_client.models.core_competency_set_course_competency_ruleoutcome_request import CoreCompetencySetCourseCompetencyRuleoutcomeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencySetCourseCompetencyRuleoutcomeRequest from a JSON string
core_competency_set_course_competency_ruleoutcome_request_instance = CoreCompetencySetCourseCompetencyRuleoutcomeRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencySetCourseCompetencyRuleoutcomeRequest.to_json())

# convert the object into a dict
core_competency_set_course_competency_ruleoutcome_request_dict = core_competency_set_course_competency_ruleoutcome_request_instance.to_dict()
# create an instance of CoreCompetencySetCourseCompetencyRuleoutcomeRequest from a dict
core_competency_set_course_competency_ruleoutcome_request_from_dict = CoreCompetencySetCourseCompetencyRuleoutcomeRequest.from_dict(core_competency_set_course_competency_ruleoutcome_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


