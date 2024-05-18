# GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner

Grade items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**averageformatted** | **str** | Grade average | [optional] [default to 'null']
**categoryid** | **int** | Grade item category id | [optional] [default to null]
**cmid** | **int** | Course module id (if type mod) | [optional] [default to null]
**feedback** | **str** | Grade feedback | [optional] [default to 'null']
**feedbackformat** | **int** | feedback format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**gradedategraded** | **int** | Grade graded date | [optional] [default to null]
**gradedatesubmitted** | **int** | Grade submit date | [optional] [default to null]
**gradeformatted** | **str** | The grade formatted | [optional] [default to 'null']
**gradehiddenbydate** | **bool** | Grade hidden by date? | [optional] [default to False]
**gradeishidden** | **bool** | Grade is hidden? | [optional] [default to False]
**gradeislocked** | **bool** | Grade is locked? | [optional] [default to False]
**gradeisoverridden** | **bool** | Grade overridden? | [optional] [default to False]
**grademax** | **float** | Grade max | [optional] [default to null]
**grademin** | **float** | Grade min | [optional] [default to null]
**gradeneedsupdate** | **bool** | Grade needs update? | [optional] [default to False]
**graderaw** | **float** | Grade raw | [optional] [default to null]
**id** | **int** | Grade item id | [optional] [default to null]
**idnumber** | **str** | Grade item idnumber | [optional] [default to 'null']
**iteminstance** | **int** | Grade item instance | [optional] [default to null]
**itemmodule** | **str** | Grade item module | [optional] [default to 'null']
**itemname** | **str** | Grade item name | [optional] [default to 'null']
**itemnumber** | **int** | Grade item item number | [optional] [default to null]
**itemtype** | **str** | Grade item type | [optional] [default to 'null']
**lettergradeformatted** | **str** | Letter grade | [optional] [default to 'null']
**locked** | **bool** | Grade item for user locked? | [optional] [default to False]
**numusers** | **int** | Num users in course | [optional] [default to null]
**outcomeid** | **int** | Outcome id | [optional] [default to null]
**percentageformatted** | **str** | Percentage | [optional] [default to 'null']
**rangeformatted** | **str** | Range formatted | [optional] [default to 'null']
**rank** | **int** | Rank in the course | [optional] [default to null]
**scaleid** | **int** | Scale id | [optional] [default to null]
**status** | **str** | Status | [optional] [default to 'null']
**weightformatted** | **str** | Weight | [optional] [default to 'null']
**weightraw** | **float** | Weight raw | [optional] [default to null]

## Example

```python
from openapi_client.models.gradereport_user_get_grade_items200_response_usergrades_inner_gradeitems_inner import GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner from a JSON string
gradereport_user_get_grade_items200_response_usergrades_inner_gradeitems_inner_instance = GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner.from_json(json)
# print the JSON string representation of the object
print(GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner.to_json())

# convert the object into a dict
gradereport_user_get_grade_items200_response_usergrades_inner_gradeitems_inner_dict = gradereport_user_get_grade_items200_response_usergrades_inner_gradeitems_inner_instance.to_dict()
# create an instance of GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner from a dict
gradereport_user_get_grade_items200_response_usergrades_inner_gradeitems_inner_from_dict = GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner.from_dict(gradereport_user_get_grade_items200_response_usergrades_inner_gradeitems_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


