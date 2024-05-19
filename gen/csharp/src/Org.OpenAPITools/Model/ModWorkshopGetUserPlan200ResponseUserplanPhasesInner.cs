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
    /// ModWorkshopGetUserPlan200ResponseUserplanPhasesInner
    /// </summary>
    [DataContract(Name = "mod_workshop_get_user_plan_200_response_userplan_phases_inner")]
    public partial class ModWorkshopGetUserPlan200ResponseUserplanPhasesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopGetUserPlan200ResponseUserplanPhasesInner" /> class.
        /// </summary>
        /// <param name="actions">actions.</param>
        /// <param name="active">Whether is the active task. (default to null).</param>
        /// <param name="code">Phase code. (default to null).</param>
        /// <param name="tasks">tasks.</param>
        /// <param name="title">Phase title. (default to &quot;null&quot;).</param>
        public ModWorkshopGetUserPlan200ResponseUserplanPhasesInner(List<ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner> actions = default(List<ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner>), bool active = null, int code = null, List<ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner> tasks = default(List<ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner>), string title = @"null")
        {
            this.Actions = actions;
            this.Active = active;
            this.Code = code;
            this.Tasks = tasks;
            // use default value if no "title" provided
            this.Title = title ?? @"null";
        }

        /// <summary>
        /// Gets or Sets Actions
        /// </summary>
        [DataMember(Name = "actions", EmitDefaultValue = false)]
        public List<ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner> Actions { get; set; }

        /// <summary>
        /// Whether is the active task.
        /// </summary>
        /// <value>Whether is the active task.</value>
        [DataMember(Name = "active", EmitDefaultValue = true)]
        public bool Active { get; set; }

        /// <summary>
        /// Phase code.
        /// </summary>
        /// <value>Phase code.</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public int Code { get; set; }

        /// <summary>
        /// Gets or Sets Tasks
        /// </summary>
        [DataMember(Name = "tasks", EmitDefaultValue = false)]
        public List<ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner> Tasks { get; set; }

        /// <summary>
        /// Phase title.
        /// </summary>
        /// <value>Phase title.</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWorkshopGetUserPlan200ResponseUserplanPhasesInner {\n");
            sb.Append("  Actions: ").Append(Actions).Append("\n");
            sb.Append("  Active: ").Append(Active).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Tasks: ").Append(Tasks).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
