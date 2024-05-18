# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_table_get_dynamic_table_content_request import CoreTableGetDynamicTableContentRequest

class TestCoreTableGetDynamicTableContentRequest(unittest.TestCase):
    """CoreTableGetDynamicTableContentRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreTableGetDynamicTableContentRequest:
        """Test CoreTableGetDynamicTableContentRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreTableGetDynamicTableContentRequest`
        """
        model = CoreTableGetDynamicTableContentRequest()
        if include_optional:
            return CoreTableGetDynamicTableContentRequest(
                component = '',
                filters = [
                    openapi_client.models.core_table_get_dynamic_table_content_request_filters_inner.core_table_get_dynamic_table_content_request_filters_inner(
                        filteroptions = [
                            openapi_client.models.core_table_get_dynamic_table_content_request_filters_inner_filteroptions_inner.core_table_get_dynamic_table_content_request_filters_inner_filteroptions_inner(
                                name = 'null', 
                                value = 'null', )
                            ], 
                        jointype = 56, 
                        name = 'null', 
                        values = [
                            None
                            ], )
                    ],
                firstinitial = 'null',
                handler = 'null',
                hiddencolumns = [
                    None
                    ],
                jointype = 56,
                lastinitial = 'null',
                pagenumber = 56,
                pagesize = 56,
                resetpreferences = True,
                sortdata = [
                    openapi_client.models.core_table_get_dynamic_table_content_request_sortdata_inner.core_table_get_dynamic_table_content_request_sortdata_inner(
                        sortby = 'null', 
                        sortorder = 'null', )
                    ],
                uniqueid = 'null'
            )
        else:
            return CoreTableGetDynamicTableContentRequest(
                component = '',
                firstinitial = 'null',
                handler = 'null',
                hiddencolumns = [
                    None
                    ],
                jointype = 56,
                lastinitial = 'null',
                pagenumber = 56,
                pagesize = 56,
                resetpreferences = True,
                uniqueid = 'null',
        )
        """

    def testCoreTableGetDynamicTableContentRequest(self):
        """Test CoreTableGetDynamicTableContentRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()