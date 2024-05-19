# CoreGroupCreateGroupsRequestGroupsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | id of course | [optional] 
**Customfields** | Pointer to [**[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Description** | Pointer to **string** | group description text | [optional] [default to "null"]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Enrolmentkey** | Pointer to **string** | group enrol secret phrase | [optional] [default to "null"]
**Idnumber** | Pointer to **string** | id number | [optional] 
**Name** | Pointer to **string** | multilang compatible name, course unique | [optional] 
**Participation** | Pointer to **bool** | activity participation enabled? Only for \&quot;all\&quot; and \&quot;members\&quot; visibility. Default true. | [optional] [default to true]
**Visibility** | Pointer to **int32** | group visibility mode. 0 &#x3D; Visible to all. 1 &#x3D; Visible to members. 2 &#x3D; See own membership. 3 &#x3D; Membership is hidden. default: 0 | [optional] [default to 0]

## Methods

### NewCoreGroupCreateGroupsRequestGroupsInner

`func NewCoreGroupCreateGroupsRequestGroupsInner() *CoreGroupCreateGroupsRequestGroupsInner`

NewCoreGroupCreateGroupsRequestGroupsInner instantiates a new CoreGroupCreateGroupsRequestGroupsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupCreateGroupsRequestGroupsInnerWithDefaults

`func NewCoreGroupCreateGroupsRequestGroupsInnerWithDefaults() *CoreGroupCreateGroupsRequestGroupsInner`

NewCoreGroupCreateGroupsRequestGroupsInnerWithDefaults instantiates a new CoreGroupCreateGroupsRequestGroupsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreGroupCreateGroupsRequestGroupsInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreGroupCreateGroupsRequestGroupsInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetCustomfields() []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetCustomfieldsOk() (*[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreGroupCreateGroupsRequestGroupsInner) SetCustomfields(v []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreGroupCreateGroupsRequestGroupsInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDescription

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreGroupCreateGroupsRequestGroupsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreGroupCreateGroupsRequestGroupsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreGroupCreateGroupsRequestGroupsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreGroupCreateGroupsRequestGroupsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetEnrolmentkey

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetEnrolmentkey() string`

GetEnrolmentkey returns the Enrolmentkey field if non-nil, zero value otherwise.

### GetEnrolmentkeyOk

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetEnrolmentkeyOk() (*string, bool)`

GetEnrolmentkeyOk returns a tuple with the Enrolmentkey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnrolmentkey

`func (o *CoreGroupCreateGroupsRequestGroupsInner) SetEnrolmentkey(v string)`

SetEnrolmentkey sets Enrolmentkey field to given value.

### HasEnrolmentkey

`func (o *CoreGroupCreateGroupsRequestGroupsInner) HasEnrolmentkey() bool`

HasEnrolmentkey returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreGroupCreateGroupsRequestGroupsInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreGroupCreateGroupsRequestGroupsInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetName

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreGroupCreateGroupsRequestGroupsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreGroupCreateGroupsRequestGroupsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParticipation

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetParticipation() bool`

GetParticipation returns the Participation field if non-nil, zero value otherwise.

### GetParticipationOk

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetParticipationOk() (*bool, bool)`

GetParticipationOk returns a tuple with the Participation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParticipation

`func (o *CoreGroupCreateGroupsRequestGroupsInner) SetParticipation(v bool)`

SetParticipation sets Participation field to given value.

### HasParticipation

`func (o *CoreGroupCreateGroupsRequestGroupsInner) HasParticipation() bool`

HasParticipation returns a boolean if a field has been set.

### GetVisibility

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetVisibility() int32`

GetVisibility returns the Visibility field if non-nil, zero value otherwise.

### GetVisibilityOk

`func (o *CoreGroupCreateGroupsRequestGroupsInner) GetVisibilityOk() (*int32, bool)`

GetVisibilityOk returns a tuple with the Visibility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibility

`func (o *CoreGroupCreateGroupsRequestGroupsInner) SetVisibility(v int32)`

SetVisibility sets Visibility field to given value.

### HasVisibility

`func (o *CoreGroupCreateGroupsRequestGroupsInner) HasVisibility() bool`

HasVisibility returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


