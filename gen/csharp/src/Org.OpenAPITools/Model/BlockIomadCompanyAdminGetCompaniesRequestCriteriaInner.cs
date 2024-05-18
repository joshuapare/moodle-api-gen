/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner
    /// </summary>
    [DataContract(Name = "block_iomad_company_admin_get_companies_request_criteria_inner")]
    public partial class BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner" /> class.
        /// </summary>
        /// <param name="key">the company column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching company id,                                 \&quot;name\&quot; (string) company name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;shortname\&quot; (string) company short name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;code\&quot; (string) company code (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;suspended\&quot; (bool) company is suspended or not,                                 \&quot;city\&quot; (string) matching company city,                                 \&quot;country\&quot; (string) matching company country,                                 \&quot;timezone\&quot; (int) company timezone,                                 \&quot;lang\&quot; (string) matching company language setting (default to &quot;null&quot;).</param>
        /// <param name="value">the value to search (default to &quot;null&quot;).</param>
        public BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner(string key = @"null", string value = @"null")
        {
            // use default value if no "key" provided
            this.Key = key ?? @"null";
            // use default value if no "value" provided
            this.Value = value ?? @"null";
        }

        /// <summary>
        /// the company column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching company id,                                 \&quot;name\&quot; (string) company name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;shortname\&quot; (string) company short name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;code\&quot; (string) company code (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;suspended\&quot; (bool) company is suspended or not,                                 \&quot;city\&quot; (string) matching company city,                                 \&quot;country\&quot; (string) matching company country,                                 \&quot;timezone\&quot; (int) company timezone,                                 \&quot;lang\&quot; (string) matching company language setting
        /// </summary>
        /// <value>the company column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching company id,                                 \&quot;name\&quot; (string) company name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;shortname\&quot; (string) company short name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;code\&quot; (string) company code (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;suspended\&quot; (bool) company is suspended or not,                                 \&quot;city\&quot; (string) matching company city,                                 \&quot;country\&quot; (string) matching company country,                                 \&quot;timezone\&quot; (int) company timezone,                                 \&quot;lang\&quot; (string) matching company language setting</value>
        [DataMember(Name = "key", EmitDefaultValue = false)]
        public string Key { get; set; }

        /// <summary>
        /// the value to search
        /// </summary>
        /// <value>the value to search</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner {\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}