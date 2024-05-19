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
    /// ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
    /// </summary>
    [DataContract(Name = "report_competency_data_for_report_200_response_usercompetencies_inner_competency_comppath")]
    public partial class ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath" /> class.
        /// </summary>
        /// <param name="ancestors">ancestors (required).</param>
        /// <param name="framework">framework (required).</param>
        /// <param name="pagecontextid">pagecontextid (required) (default to null).</param>
        /// <param name="pluginbaseurl">pluginbaseurl (required) (default to &quot;null&quot;).</param>
        /// <param name="showlinks">showlinks (required) (default to null).</param>
        public ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath(List<ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner> ancestors = default(List<ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner>), ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework framework = default(ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework), int pagecontextid = null, string pluginbaseurl = @"null", bool showlinks = null)
        {
            // to ensure "ancestors" is required (not null)
            if (ancestors == null)
            {
                throw new ArgumentNullException("ancestors is a required property for ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath and cannot be null");
            }
            this.Ancestors = ancestors;
            // to ensure "framework" is required (not null)
            if (framework == null)
            {
                throw new ArgumentNullException("framework is a required property for ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath and cannot be null");
            }
            this.Framework = framework;
            this.Pagecontextid = pagecontextid;
            // to ensure "pluginbaseurl" is required (not null)
            if (pluginbaseurl == null)
            {
                throw new ArgumentNullException("pluginbaseurl is a required property for ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath and cannot be null");
            }
            this.Pluginbaseurl = pluginbaseurl;
            this.Showlinks = showlinks;
        }

        /// <summary>
        /// Gets or Sets Ancestors
        /// </summary>
        [DataMember(Name = "ancestors", IsRequired = true, EmitDefaultValue = true)]
        public List<ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner> Ancestors { get; set; }

        /// <summary>
        /// Gets or Sets Framework
        /// </summary>
        [DataMember(Name = "framework", IsRequired = true, EmitDefaultValue = true)]
        public ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework Framework { get; set; }

        /// <summary>
        /// pagecontextid
        /// </summary>
        /// <value>pagecontextid</value>
        [DataMember(Name = "pagecontextid", IsRequired = true, EmitDefaultValue = true)]
        public int Pagecontextid { get; set; }

        /// <summary>
        /// pluginbaseurl
        /// </summary>
        /// <value>pluginbaseurl</value>
        [DataMember(Name = "pluginbaseurl", IsRequired = true, EmitDefaultValue = true)]
        public string Pluginbaseurl { get; set; }

        /// <summary>
        /// showlinks
        /// </summary>
        /// <value>showlinks</value>
        [DataMember(Name = "showlinks", IsRequired = true, EmitDefaultValue = true)]
        public bool Showlinks { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath {\n");
            sb.Append("  Ancestors: ").Append(Ancestors).Append("\n");
            sb.Append("  Framework: ").Append(Framework).Append("\n");
            sb.Append("  Pagecontextid: ").Append(Pagecontextid).Append("\n");
            sb.Append("  Pluginbaseurl: ").Append(Pluginbaseurl).Append("\n");
            sb.Append("  Showlinks: ").Append(Showlinks).Append("\n");
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
