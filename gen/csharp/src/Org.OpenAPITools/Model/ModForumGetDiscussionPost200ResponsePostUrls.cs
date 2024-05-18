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
    /// ModForumGetDiscussionPost200ResponsePostUrls
    /// </summary>
    [DataContract(Name = "mod_forum_get_discussion_post_200_response_post_urls")]
    public partial class ModForumGetDiscussionPost200ResponsePostUrls : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetDiscussionPost200ResponsePostUrls" /> class.
        /// </summary>
        /// <param name="delete">The URL used to delete the post.</param>
        /// <param name="discuss">discuss.</param>
        /// <param name="edit">The URL used to edit the post.</param>
        /// <param name="export">The URL used to export the post.</param>
        /// <param name="markasread">The URL used to mark the post as read.</param>
        /// <param name="markasunread">The URL used to mark the post as unread.</param>
        /// <param name="reply">The URL used to reply to the post.</param>
        /// <param name="split">The URL used to split the discussion with the selected post being the first post in the new discussion.</param>
        /// <param name="view">The URL used to view the post.</param>
        /// <param name="viewisolated">The URL used to view the post in isolation.</param>
        /// <param name="viewparent">The URL used to view the parent of the post.</param>
        public ModForumGetDiscussionPost200ResponsePostUrls(string delete = default(string), string discuss = default(string), string edit = default(string), string export = default(string), string markasread = default(string), string markasunread = default(string), string reply = default(string), string split = default(string), string view = default(string), string viewisolated = default(string), string viewparent = default(string))
        {
            this.Delete = delete;
            this.Discuss = discuss;
            this.Edit = edit;
            this.Export = export;
            this.Markasread = markasread;
            this.Markasunread = markasunread;
            this.Reply = reply;
            this.Split = split;
            this.View = view;
            this.Viewisolated = viewisolated;
            this.Viewparent = viewparent;
        }

        /// <summary>
        /// The URL used to delete the post
        /// </summary>
        /// <value>The URL used to delete the post</value>
        [DataMember(Name = "delete", EmitDefaultValue = false)]
        public string Delete { get; set; }

        /// <summary>
        /// discuss
        /// </summary>
        /// <value>discuss</value>
        [DataMember(Name = "discuss", EmitDefaultValue = false)]
        public string Discuss { get; set; }

        /// <summary>
        /// The URL used to edit the post
        /// </summary>
        /// <value>The URL used to edit the post</value>
        [DataMember(Name = "edit", EmitDefaultValue = false)]
        public string Edit { get; set; }

        /// <summary>
        /// The URL used to export the post
        /// </summary>
        /// <value>The URL used to export the post</value>
        [DataMember(Name = "export", EmitDefaultValue = false)]
        public string Export { get; set; }

        /// <summary>
        /// The URL used to mark the post as read
        /// </summary>
        /// <value>The URL used to mark the post as read</value>
        [DataMember(Name = "markasread", EmitDefaultValue = false)]
        public string Markasread { get; set; }

        /// <summary>
        /// The URL used to mark the post as unread
        /// </summary>
        /// <value>The URL used to mark the post as unread</value>
        [DataMember(Name = "markasunread", EmitDefaultValue = false)]
        public string Markasunread { get; set; }

        /// <summary>
        /// The URL used to reply to the post
        /// </summary>
        /// <value>The URL used to reply to the post</value>
        [DataMember(Name = "reply", EmitDefaultValue = false)]
        public string Reply { get; set; }

        /// <summary>
        /// The URL used to split the discussion with the selected post being the first post in the new discussion
        /// </summary>
        /// <value>The URL used to split the discussion with the selected post being the first post in the new discussion</value>
        [DataMember(Name = "split", EmitDefaultValue = false)]
        public string Split { get; set; }

        /// <summary>
        /// The URL used to view the post
        /// </summary>
        /// <value>The URL used to view the post</value>
        [DataMember(Name = "view", EmitDefaultValue = false)]
        public string View { get; set; }

        /// <summary>
        /// The URL used to view the post in isolation
        /// </summary>
        /// <value>The URL used to view the post in isolation</value>
        [DataMember(Name = "viewisolated", EmitDefaultValue = false)]
        public string Viewisolated { get; set; }

        /// <summary>
        /// The URL used to view the parent of the post
        /// </summary>
        /// <value>The URL used to view the parent of the post</value>
        [DataMember(Name = "viewparent", EmitDefaultValue = false)]
        public string Viewparent { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumGetDiscussionPost200ResponsePostUrls {\n");
            sb.Append("  Delete: ").Append(Delete).Append("\n");
            sb.Append("  Discuss: ").Append(Discuss).Append("\n");
            sb.Append("  Edit: ").Append(Edit).Append("\n");
            sb.Append("  Export: ").Append(Export).Append("\n");
            sb.Append("  Markasread: ").Append(Markasread).Append("\n");
            sb.Append("  Markasunread: ").Append(Markasunread).Append("\n");
            sb.Append("  Reply: ").Append(Reply).Append("\n");
            sb.Append("  Split: ").Append(Split).Append("\n");
            sb.Append("  View: ").Append(View).Append("\n");
            sb.Append("  Viewisolated: ").Append(Viewisolated).Append("\n");
            sb.Append("  Viewparent: ").Append(Viewparent).Append("\n");
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
