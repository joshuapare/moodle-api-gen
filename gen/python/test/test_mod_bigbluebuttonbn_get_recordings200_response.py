# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_bigbluebuttonbn_get_recordings200_response import ModBigbluebuttonbnGetRecordings200Response

class TestModBigbluebuttonbnGetRecordings200Response(unittest.TestCase):
    """ModBigbluebuttonbnGetRecordings200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModBigbluebuttonbnGetRecordings200Response:
        """Test ModBigbluebuttonbnGetRecordings200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModBigbluebuttonbnGetRecordings200Response`
        """
        model = ModBigbluebuttonbnGetRecordings200Response()
        if include_optional:
            return ModBigbluebuttonbnGetRecordings200Response(
                status = True,
                tabledata = openapi_client.models.mod_bigbluebuttonbn_get_recordings_200_response_tabledata.mod_bigbluebuttonbn_get_recordings_200_response_tabledata(
                    activity = '', 
                    columns = [
                        openapi_client.models.mod_bigbluebuttonbn_get_recordings_200_response_tabledata_columns_inner.mod_bigbluebuttonbn_get_recordings_200_response_tabledata_columns_inner(
                            allow_html = True, 
                            formatter = 'null', 
                            key = '', 
                            label = '', 
                            sortable = True, 
                            type = 'null', 
                            width = '', )
                        ], 
                    data = '', 
                    locale = '', 
                    ping_interval = 56, 
                    profile_features = [
                        None
                        ], ),
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return ModBigbluebuttonbnGetRecordings200Response(
                status = True,
        )
        """

    def testModBigbluebuttonbnGetRecordings200Response(self):
        """Test ModBigbluebuttonbnGetRecordings200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()