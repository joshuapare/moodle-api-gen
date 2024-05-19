# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.block_iomad_company_admin_get_companies200_response import BlockIomadCompanyAdminGetCompanies200Response

class TestBlockIomadCompanyAdminGetCompanies200Response(unittest.TestCase):
    """BlockIomadCompanyAdminGetCompanies200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BlockIomadCompanyAdminGetCompanies200Response:
        """Test BlockIomadCompanyAdminGetCompanies200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BlockIomadCompanyAdminGetCompanies200Response`
        """
        model = BlockIomadCompanyAdminGetCompanies200Response()
        if include_optional:
            return BlockIomadCompanyAdminGetCompanies200Response(
                companies = [
                    openapi_client.models.block_iomad_company_admin_get_companies_200_response_companies_inner.block_iomad_company_admin_get_companies_200_response_companies_inner(
                        address = '', 
                        autosubscribe = 56, 
                        city = '', 
                        code = '', 
                        companyterminated = 56, 
                        country = '', 
                        custom1 = '', 
                        custom2 = '', 
                        custom3 = '', 
                        customcss = '', 
                        ecommerce = 56, 
                        headingcolor = '', 
                        hostname = '', 
                        htmleditor = 56, 
                        id = 56, 
                        lang = '', 
                        linkcolor = '', 
                        maildigest = 56, 
                        maildisplay = 56, 
                        mailformat = 56, 
                        maincolor = '', 
                        maxusers = 56, 
                        name = '', 
                        parentid = 56, 
                        region = '', 
                        screenreader = 56, 
                        shortname = '', 
                        suspendafter = 56, 
                        suspended = 56, 
                        theme = '', 
                        timezone = '', 
                        trackforums = 56, 
                        validto = 56, )
                    ],
                warnings = [
                    openapi_client.models.block_iomad_company_admin_get_companies_200_response_warnings_inner.block_iomad_company_admin_get_companies_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return BlockIomadCompanyAdminGetCompanies200Response(
                companies = [
                    openapi_client.models.block_iomad_company_admin_get_companies_200_response_companies_inner.block_iomad_company_admin_get_companies_200_response_companies_inner(
                        address = '', 
                        autosubscribe = 56, 
                        city = '', 
                        code = '', 
                        companyterminated = 56, 
                        country = '', 
                        custom1 = '', 
                        custom2 = '', 
                        custom3 = '', 
                        customcss = '', 
                        ecommerce = 56, 
                        headingcolor = '', 
                        hostname = '', 
                        htmleditor = 56, 
                        id = 56, 
                        lang = '', 
                        linkcolor = '', 
                        maildigest = 56, 
                        maildisplay = 56, 
                        mailformat = 56, 
                        maincolor = '', 
                        maxusers = 56, 
                        name = '', 
                        parentid = 56, 
                        region = '', 
                        screenreader = 56, 
                        shortname = '', 
                        suspendafter = 56, 
                        suspended = 56, 
                        theme = '', 
                        timezone = '', 
                        trackforums = 56, 
                        validto = 56, )
                    ],
        )
        """

    def testBlockIomadCompanyAdminGetCompanies200Response(self):
        """Test BlockIomadCompanyAdminGetCompanies200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
