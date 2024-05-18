# CoreCompetencyCreatePlan200ResponseReviewer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**department** | **str** | department | [default to '']
**email** | **str** | email | [default to '']
**fullname** | **str** | fullname | 
**id** | **int** | id | 
**identity** | **str** | identity | [default to 'null']
**idnumber** | **str** | idnumber | [default to '']
**institution** | **str** | institution | [default to '']
**phone1** | **str** | phone1 | [default to '']
**phone2** | **str** | phone2 | [default to '']
**profileimageurl** | **str** | profileimageurl | [default to 'null']
**profileimageurlsmall** | **str** | profileimageurlsmall | [default to 'null']
**profileurl** | **str** | profileurl | [default to 'null']

## Example

```python
from openapi_client.models.core_competency_create_plan200_response_reviewer import CoreCompetencyCreatePlan200ResponseReviewer

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyCreatePlan200ResponseReviewer from a JSON string
core_competency_create_plan200_response_reviewer_instance = CoreCompetencyCreatePlan200ResponseReviewer.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyCreatePlan200ResponseReviewer.to_json())

# convert the object into a dict
core_competency_create_plan200_response_reviewer_dict = core_competency_create_plan200_response_reviewer_instance.to_dict()
# create an instance of CoreCompetencyCreatePlan200ResponseReviewer from a dict
core_competency_create_plan200_response_reviewer_from_dict = CoreCompetencyCreatePlan200ResponseReviewer.from_dict(core_competency_create_plan200_response_reviewer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


