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
    /// CoreReportbuilderSchedulesDeleteRequest
    /// </summary>
    [DataContract(Name = "core_reportbuilder_schedules_delete_request")]
    public partial class CoreReportbuilderSchedulesDeleteRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderSchedulesDeleteRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreReportbuilderSchedulesDeleteRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderSchedulesDeleteRequest" /> class.
        /// </summary>
        /// <param name="reportid">Report ID (required).</param>
        /// <param name="scheduleid">Schedule ID (required) (default to null).</param>
        public CoreReportbuilderSchedulesDeleteRequest(int reportid = default(int), int scheduleid = null)
        {
            this.Reportid = reportid;
            this.Scheduleid = scheduleid;
        }

        /// <summary>
        /// Report ID
        /// </summary>
        /// <value>Report ID</value>
        [DataMember(Name = "reportid", IsRequired = true, EmitDefaultValue = true)]
        public int Reportid { get; set; }

        /// <summary>
        /// Schedule ID
        /// </summary>
        /// <value>Schedule ID</value>
        [DataMember(Name = "scheduleid", IsRequired = true, EmitDefaultValue = true)]
        public int Scheduleid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreReportbuilderSchedulesDeleteRequest {\n");
            sb.Append("  Reportid: ").Append(Reportid).Append("\n");
            sb.Append("  Scheduleid: ").Append(Scheduleid).Append("\n");
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