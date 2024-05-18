# # CoreCohortCreateCohortsRequestCohortsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categorytype** | [**\OpenAPI\Client\Model\CoreCohortCreateCohortsRequestCohortsInnerCategorytype**](CoreCohortCreateCohortsRequestCohortsInnerCategorytype.md) |  | [optional]
**customfields** | [**\OpenAPI\Client\Model\CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner[]**](CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional]
**description** | **string** | cohort description | [optional] [default to 'null']
**descriptionformat** | **int** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**idnumber** | **string** | cohort idnumber | [optional] [default to 'null']
**name** | **string** | cohort name | [optional] [default to 'null']
**theme** | **string** | the cohort theme. The allowcohortthemes setting must be enabled on Moodle | [optional] [default to 'null']
**visible** | **bool** | cohort visible | [optional] [default to true]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
