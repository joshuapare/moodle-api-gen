# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.core_webservice_get_site_info200_response_advancedfeatures_inner import CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner
from openapi_client.models.core_webservice_get_site_info200_response_functions_inner import CoreWebserviceGetSiteInfo200ResponseFunctionsInner
from typing import Optional, Set
from typing_extensions import Self

class CoreWebserviceGetSiteInfo200Response(BaseModel):
    """
    CoreWebserviceGetSiteInfo200Response
    """ # noqa: E501
    advancedfeatures: Optional[List[CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner]] = None
    downloadfiles: Optional[StrictInt] = Field(default=null, description="1 if users are allowed to download files, 0 if not")
    firstname: StrictStr = Field(description="first name")
    fullname: StrictStr = Field(description="user full name")
    functions: List[CoreWebserviceGetSiteInfo200ResponseFunctionsInner]
    lang: StrictStr = Field(description="Current language.")
    lastname: StrictStr = Field(description="last name")
    limitconcurrentlogins: Optional[StrictInt] = Field(default=null, description="Number of concurrent sessions allowed")
    mobilecssurl: Optional[StrictStr] = Field(default='null', description="Mobile custom CSS theme")
    release: Optional[StrictStr] = Field(default='null', description="Moodle release number")
    sitecalendartype: Optional[StrictStr] = Field(default='null', description="Calendar type set in the site.")
    siteid: Optional[StrictInt] = Field(default=null, description="Site course ID")
    sitename: StrictStr = Field(description="site name")
    siteurl: StrictStr = Field(description="site url")
    theme: Optional[StrictStr] = Field(default='null', description="Current theme for the user.")
    uploadfiles: Optional[StrictInt] = Field(default=null, description="1 if users are allowed to upload files, 0 if not")
    usercalendartype: Optional[StrictStr] = Field(default='null', description="Calendar typed used by the user.")
    usercanmanageownfiles: Optional[StrictBool] = Field(default=False, description="true if the user can manage his own files")
    userhomepage: Optional[StrictInt] = Field(default=null, description="the default home page for the user: 0 for the site home, 1 for dashboard")
    userid: StrictInt = Field(description="user id")
    userissiteadmin: Optional[StrictBool] = Field(default=False, description="Whether the user is a site admin or not.")
    usermaxuploadfilesize: Optional[StrictInt] = Field(default=null, description="user max upload file size (bytes). -1 means the user can ignore the upload file size")
    username: StrictStr = Field(description="username")
    userpictureurl: StrictStr = Field(description="the user profile picture.                     Warning: this url is the public URL that only works when forcelogin is set to NO and guestaccess is set to YES.                     In order to retrieve user profile pictures independently of the Moodle config, replace \"pluginfile.php\" by                     \"webservice/pluginfile.php?token=WSTOKEN&file=\"                     Of course the user can only see profile picture depending                     on his/her permissions. Moreover it is recommended to use HTTPS too.")
    userprivateaccesskey: Optional[StrictStr] = Field(default='null', description="Private user access key for fetching files.")
    userquota: Optional[StrictInt] = Field(default=null, description="user quota (bytes). 0 means user can ignore the quota")
    usersessionscount: Optional[StrictInt] = Field(default=null, description="Number of active sessions for current user.                     Only returned when limitconcurrentlogins is used.")
    version: Optional[StrictStr] = Field(default='null', description="Moodle version number")
    __properties: ClassVar[List[str]] = ["advancedfeatures", "downloadfiles", "firstname", "fullname", "functions", "lang", "lastname", "limitconcurrentlogins", "mobilecssurl", "release", "sitecalendartype", "siteid", "sitename", "siteurl", "theme", "uploadfiles", "usercalendartype", "usercanmanageownfiles", "userhomepage", "userid", "userissiteadmin", "usermaxuploadfilesize", "username", "userpictureurl", "userprivateaccesskey", "userquota", "usersessionscount", "version"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of CoreWebserviceGetSiteInfo200Response from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in advancedfeatures (list)
        _items = []
        if self.advancedfeatures:
            for _item in self.advancedfeatures:
                if _item:
                    _items.append(_item.to_dict())
            _dict['advancedfeatures'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in functions (list)
        _items = []
        if self.functions:
            for _item in self.functions:
                if _item:
                    _items.append(_item.to_dict())
            _dict['functions'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreWebserviceGetSiteInfo200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "advancedfeatures": [CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.from_dict(_item) for _item in obj["advancedfeatures"]] if obj.get("advancedfeatures") is not None else None,
            "downloadfiles": obj.get("downloadfiles") if obj.get("downloadfiles") is not None else null,
            "firstname": obj.get("firstname") if obj.get("firstname") is not None else 'null',
            "fullname": obj.get("fullname") if obj.get("fullname") is not None else 'null',
            "functions": [CoreWebserviceGetSiteInfo200ResponseFunctionsInner.from_dict(_item) for _item in obj["functions"]] if obj.get("functions") is not None else None,
            "lang": obj.get("lang") if obj.get("lang") is not None else 'null',
            "lastname": obj.get("lastname") if obj.get("lastname") is not None else 'null',
            "limitconcurrentlogins": obj.get("limitconcurrentlogins") if obj.get("limitconcurrentlogins") is not None else null,
            "mobilecssurl": obj.get("mobilecssurl") if obj.get("mobilecssurl") is not None else 'null',
            "release": obj.get("release") if obj.get("release") is not None else 'null',
            "sitecalendartype": obj.get("sitecalendartype") if obj.get("sitecalendartype") is not None else 'null',
            "siteid": obj.get("siteid") if obj.get("siteid") is not None else null,
            "sitename": obj.get("sitename") if obj.get("sitename") is not None else 'null',
            "siteurl": obj.get("siteurl") if obj.get("siteurl") is not None else 'null',
            "theme": obj.get("theme") if obj.get("theme") is not None else 'null',
            "uploadfiles": obj.get("uploadfiles") if obj.get("uploadfiles") is not None else null,
            "usercalendartype": obj.get("usercalendartype") if obj.get("usercalendartype") is not None else 'null',
            "usercanmanageownfiles": obj.get("usercanmanageownfiles") if obj.get("usercanmanageownfiles") is not None else False,
            "userhomepage": obj.get("userhomepage") if obj.get("userhomepage") is not None else null,
            "userid": obj.get("userid"),
            "userissiteadmin": obj.get("userissiteadmin") if obj.get("userissiteadmin") is not None else False,
            "usermaxuploadfilesize": obj.get("usermaxuploadfilesize") if obj.get("usermaxuploadfilesize") is not None else null,
            "username": obj.get("username") if obj.get("username") is not None else 'null',
            "userpictureurl": obj.get("userpictureurl") if obj.get("userpictureurl") is not None else 'null',
            "userprivateaccesskey": obj.get("userprivateaccesskey") if obj.get("userprivateaccesskey") is not None else 'null',
            "userquota": obj.get("userquota") if obj.get("userquota") is not None else null,
            "usersessionscount": obj.get("usersessionscount") if obj.get("usersessionscount") is not None else null,
            "version": obj.get("version") if obj.get("version") is not None else 'null'
        })
        return _obj

