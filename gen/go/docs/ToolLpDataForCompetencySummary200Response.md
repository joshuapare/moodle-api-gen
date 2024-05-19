# ToolLpDataForCompetencySummary200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competency** | [**CoreCompetencyCreateCompetency200Response**](CoreCompetencyCreateCompetency200Response.md) |  | 
**Comppath** | [**ToolLpDataForCompetencySummary200ResponseComppath**](ToolLpDataForCompetencySummary200ResponseComppath.md) |  | 
**Framework** | [**CoreCompetencyDuplicateCompetencyFramework200Response**](CoreCompetencyDuplicateCompetencyFramework200Response.md) |  | 
**Hascourses** | **bool** | hascourses | 
**Hasrelatedcompetencies** | **bool** | hasrelatedcompetencies | 
**Linkedcourses** | [**[]CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner**](CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md) |  | 
**Pluginbaseurl** | **string** | pluginbaseurl | 
**Relatedcompetencies** | [**[]CoreCompetencyReadUserEvidence200ResponseCompetenciesInner**](CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md) |  | 
**Scaleconfiguration** | **string** | scaleconfiguration | 
**Scaleid** | **int32** | scaleid | 
**Taxonomyterm** | **string** | taxonomyterm | 

## Methods

### NewToolLpDataForCompetencySummary200Response

`func NewToolLpDataForCompetencySummary200Response(competency CoreCompetencyCreateCompetency200Response, comppath ToolLpDataForCompetencySummary200ResponseComppath, framework CoreCompetencyDuplicateCompetencyFramework200Response, hascourses bool, hasrelatedcompetencies bool, linkedcourses []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner, pluginbaseurl string, relatedcompetencies []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner, scaleconfiguration string, scaleid int32, taxonomyterm string, ) *ToolLpDataForCompetencySummary200Response`

NewToolLpDataForCompetencySummary200Response instantiates a new ToolLpDataForCompetencySummary200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForCompetencySummary200ResponseWithDefaults

`func NewToolLpDataForCompetencySummary200ResponseWithDefaults() *ToolLpDataForCompetencySummary200Response`

NewToolLpDataForCompetencySummary200ResponseWithDefaults instantiates a new ToolLpDataForCompetencySummary200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetency

`func (o *ToolLpDataForCompetencySummary200Response) GetCompetency() CoreCompetencyCreateCompetency200Response`

GetCompetency returns the Competency field if non-nil, zero value otherwise.

### GetCompetencyOk

`func (o *ToolLpDataForCompetencySummary200Response) GetCompetencyOk() (*CoreCompetencyCreateCompetency200Response, bool)`

GetCompetencyOk returns a tuple with the Competency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetency

`func (o *ToolLpDataForCompetencySummary200Response) SetCompetency(v CoreCompetencyCreateCompetency200Response)`

SetCompetency sets Competency field to given value.


### GetComppath

`func (o *ToolLpDataForCompetencySummary200Response) GetComppath() ToolLpDataForCompetencySummary200ResponseComppath`

GetComppath returns the Comppath field if non-nil, zero value otherwise.

### GetComppathOk

`func (o *ToolLpDataForCompetencySummary200Response) GetComppathOk() (*ToolLpDataForCompetencySummary200ResponseComppath, bool)`

GetComppathOk returns a tuple with the Comppath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComppath

`func (o *ToolLpDataForCompetencySummary200Response) SetComppath(v ToolLpDataForCompetencySummary200ResponseComppath)`

SetComppath sets Comppath field to given value.


### GetFramework

`func (o *ToolLpDataForCompetencySummary200Response) GetFramework() CoreCompetencyDuplicateCompetencyFramework200Response`

GetFramework returns the Framework field if non-nil, zero value otherwise.

### GetFrameworkOk

`func (o *ToolLpDataForCompetencySummary200Response) GetFrameworkOk() (*CoreCompetencyDuplicateCompetencyFramework200Response, bool)`

GetFrameworkOk returns a tuple with the Framework field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFramework

`func (o *ToolLpDataForCompetencySummary200Response) SetFramework(v CoreCompetencyDuplicateCompetencyFramework200Response)`

SetFramework sets Framework field to given value.


### GetHascourses

`func (o *ToolLpDataForCompetencySummary200Response) GetHascourses() bool`

GetHascourses returns the Hascourses field if non-nil, zero value otherwise.

### GetHascoursesOk

`func (o *ToolLpDataForCompetencySummary200Response) GetHascoursesOk() (*bool, bool)`

GetHascoursesOk returns a tuple with the Hascourses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHascourses

`func (o *ToolLpDataForCompetencySummary200Response) SetHascourses(v bool)`

SetHascourses sets Hascourses field to given value.


### GetHasrelatedcompetencies

`func (o *ToolLpDataForCompetencySummary200Response) GetHasrelatedcompetencies() bool`

GetHasrelatedcompetencies returns the Hasrelatedcompetencies field if non-nil, zero value otherwise.

### GetHasrelatedcompetenciesOk

`func (o *ToolLpDataForCompetencySummary200Response) GetHasrelatedcompetenciesOk() (*bool, bool)`

GetHasrelatedcompetenciesOk returns a tuple with the Hasrelatedcompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasrelatedcompetencies

`func (o *ToolLpDataForCompetencySummary200Response) SetHasrelatedcompetencies(v bool)`

SetHasrelatedcompetencies sets Hasrelatedcompetencies field to given value.


### GetLinkedcourses

`func (o *ToolLpDataForCompetencySummary200Response) GetLinkedcourses() []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner`

GetLinkedcourses returns the Linkedcourses field if non-nil, zero value otherwise.

### GetLinkedcoursesOk

`func (o *ToolLpDataForCompetencySummary200Response) GetLinkedcoursesOk() (*[]CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner, bool)`

GetLinkedcoursesOk returns a tuple with the Linkedcourses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinkedcourses

`func (o *ToolLpDataForCompetencySummary200Response) SetLinkedcourses(v []CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner)`

SetLinkedcourses sets Linkedcourses field to given value.


### GetPluginbaseurl

`func (o *ToolLpDataForCompetencySummary200Response) GetPluginbaseurl() string`

GetPluginbaseurl returns the Pluginbaseurl field if non-nil, zero value otherwise.

### GetPluginbaseurlOk

`func (o *ToolLpDataForCompetencySummary200Response) GetPluginbaseurlOk() (*string, bool)`

GetPluginbaseurlOk returns a tuple with the Pluginbaseurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPluginbaseurl

`func (o *ToolLpDataForCompetencySummary200Response) SetPluginbaseurl(v string)`

SetPluginbaseurl sets Pluginbaseurl field to given value.


### GetRelatedcompetencies

`func (o *ToolLpDataForCompetencySummary200Response) GetRelatedcompetencies() []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner`

GetRelatedcompetencies returns the Relatedcompetencies field if non-nil, zero value otherwise.

### GetRelatedcompetenciesOk

`func (o *ToolLpDataForCompetencySummary200Response) GetRelatedcompetenciesOk() (*[]CoreCompetencyReadUserEvidence200ResponseCompetenciesInner, bool)`

GetRelatedcompetenciesOk returns a tuple with the Relatedcompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedcompetencies

`func (o *ToolLpDataForCompetencySummary200Response) SetRelatedcompetencies(v []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner)`

SetRelatedcompetencies sets Relatedcompetencies field to given value.


### GetScaleconfiguration

`func (o *ToolLpDataForCompetencySummary200Response) GetScaleconfiguration() string`

GetScaleconfiguration returns the Scaleconfiguration field if non-nil, zero value otherwise.

### GetScaleconfigurationOk

`func (o *ToolLpDataForCompetencySummary200Response) GetScaleconfigurationOk() (*string, bool)`

GetScaleconfigurationOk returns a tuple with the Scaleconfiguration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleconfiguration

`func (o *ToolLpDataForCompetencySummary200Response) SetScaleconfiguration(v string)`

SetScaleconfiguration sets Scaleconfiguration field to given value.


### GetScaleid

`func (o *ToolLpDataForCompetencySummary200Response) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *ToolLpDataForCompetencySummary200Response) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *ToolLpDataForCompetencySummary200Response) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.


### GetTaxonomyterm

`func (o *ToolLpDataForCompetencySummary200Response) GetTaxonomyterm() string`

GetTaxonomyterm returns the Taxonomyterm field if non-nil, zero value otherwise.

### GetTaxonomytermOk

`func (o *ToolLpDataForCompetencySummary200Response) GetTaxonomytermOk() (*string, bool)`

GetTaxonomytermOk returns a tuple with the Taxonomyterm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxonomyterm

`func (o *ToolLpDataForCompetencySummary200Response) SetTaxonomyterm(v string)`

SetTaxonomyterm sets Taxonomyterm field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


