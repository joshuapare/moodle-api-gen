# ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competency** | [**CoreCompetencyCreateCompetency200Response**](CoreCompetencyCreateCompetency200Response.md) |  | 
**Comppath** | [**ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath**](ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath.md) |  | 
**Framework** | [**CoreCompetencyDuplicateCompetencyFramework200Response**](CoreCompetencyDuplicateCompetencyFramework200Response.md) |  | 
**Hascourses** | **bool** | hascourses | [default to null]
**Hasrelatedcompetencies** | **bool** | hasrelatedcompetencies | [default to null]
**Linkedcourses** | [**[]CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner**](CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md) |  | 
**Pluginbaseurl** | **string** | pluginbaseurl | 
**Relatedcompetencies** | [**[]CoreCompetencyReadUserEvidence200ResponseCompetenciesInner**](CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md) |  | 
**Scaleconfiguration** | **string** | scaleconfiguration | 
**Scaleid** | **int32** | scaleid | 
**Taxonomyterm** | **string** | taxonomyterm | [default to "null"]

## Methods

### NewReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency

`func NewReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency(competency CoreCompetencyCreateCompetency200Response, comppath ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath, framework CoreCompetencyDuplicateCompetencyFramework200Response, hascourses bool, hasrelatedcompetencies bool, linkedcourses []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner, pluginbaseurl string, relatedcompetencies []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner, scaleconfiguration string, scaleid int32, taxonomyterm string, ) *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency`

NewReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency instantiates a new ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyWithDefaults

`func NewReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyWithDefaults() *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency`

NewReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyWithDefaults instantiates a new ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetency

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetCompetency() CoreCompetencyCreateCompetency200Response`

GetCompetency returns the Competency field if non-nil, zero value otherwise.

### GetCompetencyOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetCompetencyOk() (*CoreCompetencyCreateCompetency200Response, bool)`

GetCompetencyOk returns a tuple with the Competency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetency

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetCompetency(v CoreCompetencyCreateCompetency200Response)`

SetCompetency sets Competency field to given value.


### GetComppath

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetComppath() ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath`

GetComppath returns the Comppath field if non-nil, zero value otherwise.

### GetComppathOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetComppathOk() (*ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath, bool)`

GetComppathOk returns a tuple with the Comppath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComppath

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetComppath(v ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath)`

SetComppath sets Comppath field to given value.


### GetFramework

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetFramework() CoreCompetencyDuplicateCompetencyFramework200Response`

GetFramework returns the Framework field if non-nil, zero value otherwise.

### GetFrameworkOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetFrameworkOk() (*CoreCompetencyDuplicateCompetencyFramework200Response, bool)`

GetFrameworkOk returns a tuple with the Framework field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFramework

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetFramework(v CoreCompetencyDuplicateCompetencyFramework200Response)`

SetFramework sets Framework field to given value.


### GetHascourses

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetHascourses() bool`

GetHascourses returns the Hascourses field if non-nil, zero value otherwise.

### GetHascoursesOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetHascoursesOk() (*bool, bool)`

GetHascoursesOk returns a tuple with the Hascourses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHascourses

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetHascourses(v bool)`

SetHascourses sets Hascourses field to given value.


### GetHasrelatedcompetencies

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetHasrelatedcompetencies() bool`

GetHasrelatedcompetencies returns the Hasrelatedcompetencies field if non-nil, zero value otherwise.

### GetHasrelatedcompetenciesOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetHasrelatedcompetenciesOk() (*bool, bool)`

GetHasrelatedcompetenciesOk returns a tuple with the Hasrelatedcompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasrelatedcompetencies

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetHasrelatedcompetencies(v bool)`

SetHasrelatedcompetencies sets Hasrelatedcompetencies field to given value.


### GetLinkedcourses

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetLinkedcourses() []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner`

GetLinkedcourses returns the Linkedcourses field if non-nil, zero value otherwise.

### GetLinkedcoursesOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetLinkedcoursesOk() (*[]CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner, bool)`

GetLinkedcoursesOk returns a tuple with the Linkedcourses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinkedcourses

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetLinkedcourses(v []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner)`

SetLinkedcourses sets Linkedcourses field to given value.


### GetPluginbaseurl

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetPluginbaseurl() string`

GetPluginbaseurl returns the Pluginbaseurl field if non-nil, zero value otherwise.

### GetPluginbaseurlOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetPluginbaseurlOk() (*string, bool)`

GetPluginbaseurlOk returns a tuple with the Pluginbaseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPluginbaseurl

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetPluginbaseurl(v string)`

SetPluginbaseurl sets Pluginbaseurl field to given value.


### GetRelatedcompetencies

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetRelatedcompetencies() []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner`

GetRelatedcompetencies returns the Relatedcompetencies field if non-nil, zero value otherwise.

### GetRelatedcompetenciesOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetRelatedcompetenciesOk() (*[]CoreCompetencyReadUserEvidence200ResponseCompetenciesInner, bool)`

GetRelatedcompetenciesOk returns a tuple with the Relatedcompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedcompetencies

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetRelatedcompetencies(v []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner)`

SetRelatedcompetencies sets Relatedcompetencies field to given value.


### GetScaleconfiguration

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetScaleconfiguration() string`

GetScaleconfiguration returns the Scaleconfiguration field if non-nil, zero value otherwise.

### GetScaleconfigurationOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetScaleconfigurationOk() (*string, bool)`

GetScaleconfigurationOk returns a tuple with the Scaleconfiguration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleconfiguration

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetScaleconfiguration(v string)`

SetScaleconfiguration sets Scaleconfiguration field to given value.


### GetScaleid

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.


### GetTaxonomyterm

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetTaxonomyterm() string`

GetTaxonomyterm returns the Taxonomyterm field if non-nil, zero value otherwise.

### GetTaxonomytermOk

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) GetTaxonomytermOk() (*string, bool)`

GetTaxonomytermOk returns a tuple with the Taxonomyterm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxonomyterm

`func (o *ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency) SetTaxonomyterm(v string)`

SetTaxonomyterm sets Taxonomyterm field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


