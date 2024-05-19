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
    /// CoreReportbuilderFiltersDeleteRequest
    /// </summary>
    [DataContract(Name = "core_reportbuilder_filters_delete_request")]
    public partial class CoreReportbuilderFiltersDeleteRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderFiltersDeleteRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreReportbuilderFiltersDeleteRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderFiltersDeleteRequest" /> class.
        /// </summary>
        /// <param name="filterid">Filter ID (required) (default to null).</param>
        /// <param name="reportid">Report ID (required).</param>
        public CoreReportbuilderFiltersDeleteRequest(int filterid = null, int reportid = default(int))
        {
            this.Filterid = filterid;
            this.Reportid = reportid;
        }

        /// <summary>
        /// Filter ID
        /// </summary>
        /// <value>Filter ID</value>
        [DataMember(Name = "filterid", IsRequired = true, EmitDefaultValue = true)]
        public int Filterid { get; set; }

        /// <summary>
        /// Report ID
        /// </summary>
        /// <value>Report ID</value>
        [DataMember(Name = "reportid", IsRequired = true, EmitDefaultValue = true)]
        public int Reportid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreReportbuilderFiltersDeleteRequest {\n");
            sb.Append("  Filterid: ").Append(Filterid).Append("\n");
            sb.Append("  Reportid: ").Append(Reportid).Append("\n");
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
