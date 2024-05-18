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
    /// ToolLpDataForPlanPage200ResponseCompetenciesInner
    /// </summary>
    [DataContract(Name = "tool_lp_data_for_plan_page_200_response_competencies_inner")]
    public partial class ToolLpDataForPlanPage200ResponseCompetenciesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForPlanPage200ResponseCompetenciesInner" /> class.
        /// </summary>
        /// <param name="competency">competency.</param>
        /// <param name="comppath">comppath.</param>
        /// <param name="usercompetency">usercompetency.</param>
        /// <param name="usercompetencyplan">usercompetencyplan.</param>
        public ToolLpDataForPlanPage200ResponseCompetenciesInner(CoreCompetencyCreateCompetency200Response competency = default(CoreCompetencyCreateCompetency200Response), ToolLpDataForCompetencySummary200ResponseComppath comppath = default(ToolLpDataForCompetencySummary200ResponseComppath), ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency usercompetency = default(ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency), ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan usercompetencyplan = default(ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan))
        {
            this.Competency = competency;
            this.Comppath = comppath;
            this.Usercompetency = usercompetency;
            this.Usercompetencyplan = usercompetencyplan;
        }

        /// <summary>
        /// Gets or Sets Competency
        /// </summary>
        [DataMember(Name = "competency", EmitDefaultValue = false)]
        public CoreCompetencyCreateCompetency200Response Competency { get; set; }

        /// <summary>
        /// Gets or Sets Comppath
        /// </summary>
        [DataMember(Name = "comppath", EmitDefaultValue = false)]
        public ToolLpDataForCompetencySummary200ResponseComppath Comppath { get; set; }

        /// <summary>
        /// Gets or Sets Usercompetency
        /// </summary>
        [DataMember(Name = "usercompetency", EmitDefaultValue = false)]
        public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency Usercompetency { get; set; }

        /// <summary>
        /// Gets or Sets Usercompetencyplan
        /// </summary>
        [DataMember(Name = "usercompetencyplan", EmitDefaultValue = false)]
        public ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan Usercompetencyplan { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolLpDataForPlanPage200ResponseCompetenciesInner {\n");
            sb.Append("  Competency: ").Append(Competency).Append("\n");
            sb.Append("  Comppath: ").Append(Comppath).Append("\n");
            sb.Append("  Usercompetency: ").Append(Usercompetency).Append("\n");
            sb.Append("  Usercompetencyplan: ").Append(Usercompetencyplan).Append("\n");
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