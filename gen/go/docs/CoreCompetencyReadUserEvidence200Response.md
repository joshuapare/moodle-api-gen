# CoreCompetencyReadUserEvidence200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanage** | **bool** | canmanage | 
**Competencies** | [**[]CoreCompetencyReadUserEvidence200ResponseCompetenciesInner**](CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md) |  | 
**Competencycount** | **int32** | competencycount | [default to null]
**Description** | **string** | description | [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Filecount** | **int32** | filecount | [default to null]
**Files** | [**[]CoreCompetencyReadUserEvidence200ResponseFilesInner**](CoreCompetencyReadUserEvidence200ResponseFilesInner.md) |  | 
**Hasurlorfiles** | **bool** | hasurlorfiles | [default to null]
**Id** | **int32** | id | [default to 0]
**Name** | **string** | name | 
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Url** | **string** | url | [default to ""]
**Urlshort** | **string** | urlshort | [default to "null"]
**Userid** | **int32** | userid | 
**Usermodified** | **int32** | usermodified | [default to 0]

## Methods

### NewCoreCompetencyReadUserEvidence200Response

`func NewCoreCompetencyReadUserEvidence200Response(canmanage bool, competencies []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner, competencycount int32, description string, filecount int32, files []CoreCompetencyReadUserEvidence200ResponseFilesInner, hasurlorfiles bool, id int32, name string, timecreated int32, timemodified int32, url string, urlshort string, userid int32, usermodified int32, ) *CoreCompetencyReadUserEvidence200Response`

NewCoreCompetencyReadUserEvidence200Response instantiates a new CoreCompetencyReadUserEvidence200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyReadUserEvidence200ResponseWithDefaults

`func NewCoreCompetencyReadUserEvidence200ResponseWithDefaults() *CoreCompetencyReadUserEvidence200Response`

NewCoreCompetencyReadUserEvidence200ResponseWithDefaults instantiates a new CoreCompetencyReadUserEvidence200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanage

`func (o *CoreCompetencyReadUserEvidence200Response) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *CoreCompetencyReadUserEvidence200Response) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetCompetencies

`func (o *CoreCompetencyReadUserEvidence200Response) GetCompetencies() []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner`

GetCompetencies returns the Competencies field if non-nil, zero value otherwise.

### GetCompetenciesOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetCompetenciesOk() (*[]CoreCompetencyReadUserEvidence200ResponseCompetenciesInner, bool)`

GetCompetenciesOk returns a tuple with the Competencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencies

`func (o *CoreCompetencyReadUserEvidence200Response) SetCompetencies(v []CoreCompetencyReadUserEvidence200ResponseCompetenciesInner)`

SetCompetencies sets Competencies field to given value.


### GetCompetencycount

`func (o *CoreCompetencyReadUserEvidence200Response) GetCompetencycount() int32`

GetCompetencycount returns the Competencycount field if non-nil, zero value otherwise.

### GetCompetencycountOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetCompetencycountOk() (*int32, bool)`

GetCompetencycountOk returns a tuple with the Competencycount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencycount

`func (o *CoreCompetencyReadUserEvidence200Response) SetCompetencycount(v int32)`

SetCompetencycount sets Competencycount field to given value.


### GetDescription

`func (o *CoreCompetencyReadUserEvidence200Response) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyReadUserEvidence200Response) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetDescriptionformat

`func (o *CoreCompetencyReadUserEvidence200Response) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyReadUserEvidence200Response) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyReadUserEvidence200Response) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetFilecount

`func (o *CoreCompetencyReadUserEvidence200Response) GetFilecount() int32`

GetFilecount returns the Filecount field if non-nil, zero value otherwise.

### GetFilecountOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetFilecountOk() (*int32, bool)`

GetFilecountOk returns a tuple with the Filecount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilecount

`func (o *CoreCompetencyReadUserEvidence200Response) SetFilecount(v int32)`

SetFilecount sets Filecount field to given value.


### GetFiles

`func (o *CoreCompetencyReadUserEvidence200Response) GetFiles() []CoreCompetencyReadUserEvidence200ResponseFilesInner`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetFilesOk() (*[]CoreCompetencyReadUserEvidence200ResponseFilesInner, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *CoreCompetencyReadUserEvidence200Response) SetFiles(v []CoreCompetencyReadUserEvidence200ResponseFilesInner)`

SetFiles sets Files field to given value.


### GetHasurlorfiles

`func (o *CoreCompetencyReadUserEvidence200Response) GetHasurlorfiles() bool`

GetHasurlorfiles returns the Hasurlorfiles field if non-nil, zero value otherwise.

### GetHasurlorfilesOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetHasurlorfilesOk() (*bool, bool)`

GetHasurlorfilesOk returns a tuple with the Hasurlorfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasurlorfiles

`func (o *CoreCompetencyReadUserEvidence200Response) SetHasurlorfiles(v bool)`

SetHasurlorfiles sets Hasurlorfiles field to given value.


### GetId

`func (o *CoreCompetencyReadUserEvidence200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyReadUserEvidence200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *CoreCompetencyReadUserEvidence200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCompetencyReadUserEvidence200Response) SetName(v string)`

SetName sets Name field to given value.


### GetTimecreated

`func (o *CoreCompetencyReadUserEvidence200Response) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyReadUserEvidence200Response) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *CoreCompetencyReadUserEvidence200Response) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyReadUserEvidence200Response) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUrl

`func (o *CoreCompetencyReadUserEvidence200Response) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreCompetencyReadUserEvidence200Response) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetUrlshort

`func (o *CoreCompetencyReadUserEvidence200Response) GetUrlshort() string`

GetUrlshort returns the Urlshort field if non-nil, zero value otherwise.

### GetUrlshortOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetUrlshortOk() (*string, bool)`

GetUrlshortOk returns a tuple with the Urlshort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrlshort

`func (o *CoreCompetencyReadUserEvidence200Response) SetUrlshort(v string)`

SetUrlshort sets Urlshort field to given value.


### GetUserid

`func (o *CoreCompetencyReadUserEvidence200Response) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCompetencyReadUserEvidence200Response) SetUserid(v int32)`

SetUserid sets Userid field to given value.


### GetUsermodified

`func (o *CoreCompetencyReadUserEvidence200Response) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyReadUserEvidence200Response) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyReadUserEvidence200Response) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


