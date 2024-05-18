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
    /// CoreReportbuilderCanViewSystemReportRequest
    /// </summary>
    [DataContract(Name = "core_reportbuilder_can_view_system_report_request")]
    public partial class CoreReportbuilderCanViewSystemReportRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderCanViewSystemReportRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreReportbuilderCanViewSystemReportRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderCanViewSystemReportRequest" /> class.
        /// </summary>
        /// <param name="area">Report area (default to &quot;&quot;).</param>
        /// <param name="component">Report component (default to &quot;&quot;).</param>
        /// <param name="context">context (required).</param>
        /// <param name="itemid">Report item ID (default to 0).</param>
        /// <param name="parameters">parameters.</param>
        /// <param name="source">Report class path (required) (default to &quot;null&quot;).</param>
        public CoreReportbuilderCanViewSystemReportRequest(string area = @"", string component = @"", CoreCohortSearchCohortsRequestContext context = default(CoreCohortSearchCohortsRequestContext), int itemid = 0, List<CoreReportbuilderCanViewSystemReportRequestParametersInner> parameters = default(List<CoreReportbuilderCanViewSystemReportRequestParametersInner>), string source = @"null")
        {
            // to ensure "context" is required (not null)
            if (context == null)
            {
                throw new ArgumentNullException("context is a required property for CoreReportbuilderCanViewSystemReportRequest and cannot be null");
            }
            this.Context = context;
            // to ensure "source" is required (not null)
            if (source == null)
            {
                throw new ArgumentNullException("source is a required property for CoreReportbuilderCanViewSystemReportRequest and cannot be null");
            }
            this.Source = source;
            // use default value if no "area" provided
            this.Area = area ?? @"";
            // use default value if no "component" provided
            this.Component = component ?? @"";
            this.Itemid = itemid;
            this.Parameters = parameters;
        }

        /// <summary>
        /// Report area
        /// </summary>
        /// <value>Report area</value>
        [DataMember(Name = "area", EmitDefaultValue = false)]
        public string Area { get; set; }

        /// <summary>
        /// Report component
        /// </summary>
        /// <value>Report component</value>
        [DataMember(Name = "component", EmitDefaultValue = false)]
        public string Component { get; set; }

        /// <summary>
        /// Gets or Sets Context
        /// </summary>
        [DataMember(Name = "context", IsRequired = true, EmitDefaultValue = true)]
        public CoreCohortSearchCohortsRequestContext Context { get; set; }

        /// <summary>
        /// Report item ID
        /// </summary>
        /// <value>Report item ID</value>
        [DataMember(Name = "itemid", EmitDefaultValue = false)]
        public int Itemid { get; set; }

        /// <summary>
        /// Gets or Sets Parameters
        /// </summary>
        [DataMember(Name = "parameters", EmitDefaultValue = false)]
        public List<CoreReportbuilderCanViewSystemReportRequestParametersInner> Parameters { get; set; }

        /// <summary>
        /// Report class path
        /// </summary>
        /// <value>Report class path</value>
        [DataMember(Name = "source", IsRequired = true, EmitDefaultValue = true)]
        public string Source { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreReportbuilderCanViewSystemReportRequest {\n");
            sb.Append("  Area: ").Append(Area).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Context: ").Append(Context).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
            sb.Append("  Parameters: ").Append(Parameters).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
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
