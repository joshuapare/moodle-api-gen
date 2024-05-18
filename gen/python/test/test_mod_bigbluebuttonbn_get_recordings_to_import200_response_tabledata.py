# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_bigbluebuttonbn_get_recordings_to_import200_response_tabledata import ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata

class TestModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata(unittest.TestCase):
    """ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata:
        """Test ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata`
        """
        model = ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata()
        if include_optional:
            return ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata(
                activity = '',
                columns = [
                    openapi_client.models.mod_bigbluebuttonbn_get_recordings_to_import_200_response_tabledata_columns_inner.mod_bigbluebuttonbn_get_recordings_to_import_200_response_tabledata_columns_inner(
                        allow_html = True, 
                        key = '', 
                        label = '', 
                        sortable = True, 
                        type = '', 
                        width = '', )
                    ],
                data = '',
                locale = '',
                ping_interval = 56,
                profile_features = [
                    None
                    ]
            )
        else:
            return ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata(
                activity = '',
                columns = [
                    openapi_client.models.mod_bigbluebuttonbn_get_recordings_to_import_200_response_tabledata_columns_inner.mod_bigbluebuttonbn_get_recordings_to_import_200_response_tabledata_columns_inner(
                        allow_html = True, 
                        key = '', 
                        label = '', 
                        sortable = True, 
                        type = '', 
                        width = '', )
                    ],
                data = '',
                locale = '',
                ping_interval = 56,
                profile_features = [
                    None
                    ],
        )
        """

    def testModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata(self):
        """Test ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
