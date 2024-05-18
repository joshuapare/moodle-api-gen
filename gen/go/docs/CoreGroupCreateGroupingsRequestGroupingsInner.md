# CoreGroupCreateGroupingsRequestGroupingsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | id of course | [optional] 
**Customfields** | Pointer to [**[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner**](CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md) |  | [optional] 
**Description** | Pointer to **string** | grouping description text | [optional] [default to "null"]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Idnumber** | Pointer to **string** | id number | [optional] 
**Name** | Pointer to **string** | multilang compatible name, course unique | [optional] [default to "null"]

## Methods

### NewCoreGroupCreateGroupingsRequestGroupingsInner

`func NewCoreGroupCreateGroupingsRequestGroupingsInner() *CoreGroupCreateGroupingsRequestGroupingsInner`

NewCoreGroupCreateGroupingsRequestGroupingsInner instantiates a new CoreGroupCreateGroupingsRequestGroupingsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGroupCreateGroupingsRequestGroupingsInnerWithDefaults

`func NewCoreGroupCreateGroupingsRequestGroupingsInnerWithDefaults() *CoreGroupCreateGroupingsRequestGroupingsInner`

NewCoreGroupCreateGroupingsRequestGroupingsInnerWithDefaults instantiates a new CoreGroupCreateGroupingsRequestGroupingsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetCustomfields() []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetCustomfieldsOk() (*[]CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) SetCustomfields(v []CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDescription

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetName

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreGroupCreateGroupingsRequestGroupingsInner) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


